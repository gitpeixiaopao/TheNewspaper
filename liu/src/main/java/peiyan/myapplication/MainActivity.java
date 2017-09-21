package peiyan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private peiyan.myapplication.myView myView;
    private ViewPager myViewPager;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myViewPager = (ViewPager) findViewById(R.id.myViewPager);
        myView = (peiyan.myapplication.myView) findViewById(R.id.myview);
        OkHttpManager.getInstance().asyncJsonStringByURL("http://h5test.newaircloud.com/api/getLayouts?sid=xkycs&cid=10024&date=", new OkHttpManager.Func1() {



            @Override
            public void onResponse(String result) {

                list = new ArrayList<String>();
                Gson gson=new Gson();
                myBean bean = gson.fromJson(result, myBean.class);
                  for (int i = 0; i < bean.layouts.size(); i++) {

                      list.add(bean.layouts.get(i).picUrl);


                  }





            }
        });


       myView.OnClick(new myView.OnClick() {

           @Override
           public void onClickLiner(int Id) {
               switch (Id){
                   case R.id.benqilanmu:
                       myViewPager.setCurrentItem(0);
                       break;
                   case R.id.baozhibanmian:
                       myViewPager.setCurrentItem(1);

                       break;
                   case R.id.image_right:

                       Intent intent=new Intent(MainActivity.this,Main2Activity.class);


                       intent.putExtra("content",list.get(0));
                       startActivity(intent);



                       break;
                   case R.id.image_left:
                      // 制造空指针
                       Object object=null;
                       object.toString();
                       break;

               }
           }
       });


        myViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {


                Fragment fragment = null;
                switch (position) {

                    case 0:
                        fragment = new Fragment1();
                        break;
                    case 1:
                        fragment = new Fragment2();

                        break;


                }


                return fragment;
            }

            @Override
            public int getCount() {
                return 2;
            }
        });


    }
}
