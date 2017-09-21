package peiyan.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;




public class myView extends LinearLayout implements View.OnClickListener {

    private TextView benqilanmu;
    private TextView baozhibanmian;
    private ImageView image_right,image_left;

    public myView(Context context) {
        this(context,null);
    }

    public myView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public myView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){


        View view = LayoutInflater.from(getContext()).inflate(R.layout.myview, this, true);
        benqilanmu = (TextView) view.findViewById(R.id.benqilanmu);
        baozhibanmian = (TextView) view.findViewById(R.id.baozhibanmian);
        image_right = (ImageView) view.findViewById(R.id.image_right);
        image_left = (ImageView) view.findViewById(R.id.image_left);
        benqilanmu.setOnClickListener(this);
        baozhibanmian.setOnClickListener(this);
        image_right.setOnClickListener(this);
        image_left.setOnClickListener(this);
    }
interface OnClick{
    void onClickLiner(int Id);
}
private OnClick click;
    public void OnClick(OnClick click){
        this.click=click;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.benqilanmu:
                click.onClickLiner(R.id.baozhibanmian);
                break;
            case R.id.baozhibanmian:
                click.onClickLiner(R.id.benqilanmu);
                break;
            case R.id.image_right:
                click.onClickLiner(R.id.image_right);
                break;
            case R.id.image_left:
                click.onClickLiner(R.id.image_left);
                break;
        }
    }
}
