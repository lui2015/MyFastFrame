package com.luli.myfastframe;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;
import com.luli.myfastframe.base.BaseActivity;
import com.luli.myfastframe.views.activity.webview.WebViewActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import luo.library.base.base.webview.BaseWebViewActivity;
import luo.library.base.utils.DialogUtil;

public class MainActivity extends BaseActivity {

    @Bind(R.id.text1)
    Button text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra(BaseWebViewActivity.URL, "http://www.baidu.com");
                startActivity(intent);

              /*  DialogUtil.createMessageDialog(MainActivity.this,"标题","内容","确定",new DialogInterface.OnClickListener(){

                   @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SuperActivityToast.create(MainActivity.this, new Style(), Style.TYPE_BUTTON)
                                .setButtonText("UNDO")
                                .setButtonIconResource(R.drawable.ic_empty)
                                .setOnButtonClickListener("good_tag_name", null,null)
                                .setProgressBarColor(Color.WHITE)
                                .setText("Email deleted")
                                .setDuration(Style.DURATION_LONG)
                                .setFrame(Style.FRAME_LOLLIPOP)
                                .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_PURPLE))
                                .setAnimations(Style.ANIMATIONS_POP).show();
                    }
                },DialogUtil.NO_ICON,true).show();*/
            }




        });
    }

    public void sayHello(View v){
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        textView.setText("Hello, " + editText.getText().toString() + "!");
    }




}
