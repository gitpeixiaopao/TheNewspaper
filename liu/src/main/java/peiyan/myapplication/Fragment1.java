package peiyan.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;



public class Fragment1 extends Fragment {

    private ViewPager viewPager;
    public List<String> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.fragmentviewpager);

        OkHttpManager.getInstance().asyncJsonStringByURL("http://h5test.newaircloud.com/api/getLayouts?sid=xkycs&cid=10024&date=", new OkHttpManager.Func1() {


            private List<Fragment> listfr;

            @Override
            public void onResponse(String result) {
                listfr = new ArrayList<Fragment>();
                list = new ArrayList<String>();
                Gson gson = new Gson();
                myBean bean = gson.fromJson(result, myBean.class);
                for (int i = 0; i < bean.layouts.size(); i++) {

                    list.add(bean.layouts.get(i).picUrl);


                }

                for (int i = 0; i < list.size(); i++) {
                    Fragment_Tupian fragment_tupian = new Fragment_Tupian();
                    fragment_tupian.setUrl(list.get(i));
                    listfr.add(fragment_tupian);

                }


                myFragmentPagerAdapter adapter = new myFragmentPagerAdapter(getActivity().getSupportFragmentManager());
                adapter.setFragment(listfr);


                viewPager.setAdapter(adapter);


            }
        });


        return view;
    }
}