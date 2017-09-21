package peiyan.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {
    private String path = "http://h5test.newaircloud.com/api/getLayouts?sid=xkycs&cid=10024&date=";
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        listView = view.findViewById(R.id.listview);


        OkHttpManager.getInstance().asyncJsonStringByURL(path, new OkHttpManager.Func1() {
            @Override
            public void onResponse(String result) {

                final List<String> list = new ArrayList<String>();

                Gson gson = new Gson();
                myBean bean = gson.fromJson(result, myBean.class);

                for (int i = 0; i < bean.layouts.size(); i++) {

                    for (int x = 0; x < bean.layouts.get(i).list.size(); x++) {
                        list.add(bean.layouts.get(i).list.get(x).title);


                    }



                }
                myAdapter adapter=new myAdapter(list,getActivity());
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                         Toast.makeText(getActivity(),list.get(i),Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });

        return view;
    }
}
