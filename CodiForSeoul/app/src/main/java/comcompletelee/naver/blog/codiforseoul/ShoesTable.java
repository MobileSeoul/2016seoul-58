package comcompletelee.naver.blog.codiforseoul;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;



/**
 * Created by hello world on 2015-12-27.
 */
public class ShoesTable extends Activity {
    TextView loafer1;
    TextView loafer2;
    TextView shoes1;
    TextView shoes2;
    TextView sandal1;
    TextView sandal2;
    TextView boots1;
    TextView boots2;
    TextView walker1;
    TextView walker2;
    TextView sneakers1;
    TextView sneakers2;
    TextView leatherOrSuede1;
    TextView leatherOrSuede2;
    TextView slipon1;
    TextView slipon2;
    TextView leatherSlipon1;
    TextView leatherSlipon2;

    WeatherForecast todayOuter;
    int high;
    int low;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoes);



        Intent intent = getIntent();

        todayOuter = (WeatherForecast) intent.getSerializableExtra("TODAY");

        loafer1 = (TextView) findViewById(R.id.loafer1);
        loafer2 = (TextView) findViewById(R.id.loafer2);
        shoes1 = (TextView) findViewById(R.id.shoes1);
        shoes2 = (TextView) findViewById(R.id.shoes2);
        sandal1 = (TextView) findViewById(R.id.sandal1);
        sandal2 = (TextView) findViewById(R.id.sandal2);
        boots1 = (TextView) findViewById(R.id.boots1);
        boots2 = (TextView) findViewById(R.id.boots2);
        walker1 = (TextView) findViewById(R.id.walker1);
        walker2 = (TextView) findViewById(R.id.walker2);
        sneakers1 = (TextView) findViewById(R.id.sneakers1);
        sneakers2 = (TextView) findViewById(R.id.sneakers2);
        leatherOrSuede1 = (TextView) findViewById(R.id.leatherOrSuede1);
        leatherOrSuede2 = (TextView) findViewById(R.id.leatherOrSuede2);
        slipon1 = (TextView) findViewById(R.id.slipon1);
        slipon2 = (TextView) findViewById(R.id.slipon2);
        leatherSlipon1 = (TextView) findViewById(R.id.leatjerSlipon1);
        leatherSlipon2 = (TextView) findViewById(R.id.leatjerSlipon2);

        low = todayOuter.getLow();
        high = todayOuter.getHigh();

        if(low>=20) {
            loafer1.setText("출격");
            loafer2.setText("출격");
            shoes1.setText("출격");
            shoes2.setText("출격");
            sandal1.setText("출격");
            sandal2.setText("출격");
            boots1.setText("퇴각");
            boots2.setText("퇴각");
            walker1.setText("퇴각");
            walker2.setText("퇴각");
            sneakers1.setText("출격");
            sneakers2.setText("출격");
            leatherOrSuede1.setText("출격");
            leatherOrSuede2.setText("출격");
            slipon1.setText("출격");
            slipon2.setText("출격");
            leatherSlipon1.setText("출격");
            leatherSlipon2.setText("출격");

            loafer1.setTextColor(Color.BLUE);
            loafer2.setTextColor(Color.BLUE);
            shoes1.setTextColor(Color.BLUE);
            shoes2.setTextColor(Color.BLUE);
            sandal1.setTextColor(Color.BLUE);
            sandal2.setTextColor(Color.BLUE);
            boots1.setTextColor(Color.RED);
            boots2.setTextColor(Color.RED);
            walker1.setTextColor(Color.RED);
            walker2.setTextColor(Color.RED);
            sneakers1.setTextColor(Color.BLUE);
            sneakers2.setTextColor(Color.BLUE);
            leatherOrSuede1.setTextColor(Color.BLUE);
            leatherOrSuede2.setTextColor(Color.BLUE);
            slipon1.setTextColor(Color.BLUE);
            slipon2.setTextColor(Color.BLUE);
            leatherSlipon1.setTextColor(Color.BLUE);
            leatherSlipon2.setTextColor(Color.BLUE);
        } else if (low >= 14 && low < 20) {
            loafer1.setText("출격");
            loafer2.setText("출격");
            shoes1.setText("출격");
            shoes2.setText("출격");
            sandal1.setText("출격");
            sandal2.setText("퇴각");
            boots1.setText("출격");
            boots2.setText("출격\n(발 땀 주의)");
            boots2.setGravity(Gravity.CENTER);
            walker1.setText("출격");
            walker2.setText("출격\n(발 땀 주의)");
            walker2.setGravity(Gravity.CENTER);
            sneakers1.setText("출격");
            sneakers2.setText("출격");
            leatherOrSuede1.setText("출격");
            leatherOrSuede2.setText("출격");
            slipon1.setText("출격");
            slipon2.setText("출격");
            leatherSlipon1.setText("출격");
            leatherSlipon2.setText("출격");

            loafer1.setTextColor(Color.BLUE);
            loafer2.setTextColor(Color.BLUE);
            shoes1.setTextColor(Color.BLUE);
            shoes2.setTextColor(Color.BLUE);
            sandal1.setTextColor(Color.BLUE);
            sandal2.setTextColor(Color.BLUE);
            boots1.setTextColor(Color.BLUE);
            boots2.setTextColor(Color.BLUE);
            walker1.setTextColor(Color.BLUE);
            walker2.setTextColor(Color.BLUE);
            sneakers1.setTextColor(Color.BLUE);
            sneakers2.setTextColor(Color.BLUE);
            leatherOrSuede1.setTextColor(Color.BLUE);
            leatherOrSuede2.setTextColor(Color.BLUE);
            slipon1.setTextColor(Color.BLUE);
            slipon2.setTextColor(Color.BLUE);
            leatherSlipon1.setTextColor(Color.BLUE);
            leatherSlipon2.setTextColor(Color.BLUE);
        } else if (low<14&&low>=3) {
            loafer1.setText("출격");
            loafer2.setText("출격");
            shoes1.setText("퇴각");
            shoes2.setText("퇴각");
            sandal1.setText("퇴각");
            sandal2.setText("퇴각");
            boots1.setText("출격");
            boots2.setText("출격");
            walker1.setText("출격");
            walker2.setText("출격");
            sneakers1.setText("출격");
            sneakers2.setText("출격");
            leatherOrSuede1.setText("출격");
            leatherOrSuede2.setText("출격");
            slipon1.setText("출격");
            slipon2.setText("출격");
            leatherSlipon1.setText("출격");
            leatherSlipon2.setText("출격");

            loafer1.setTextColor(Color.BLUE);
            loafer2.setTextColor(Color.BLUE);
            shoes1.setTextColor(Color.BLUE);
            shoes2.setTextColor(Color.BLUE);
            sandal1.setTextColor(Color.RED);
            sandal2.setTextColor(Color.RED);
            boots1.setTextColor(Color.BLUE);
            boots2.setTextColor(Color.BLUE);
            walker1.setTextColor(Color.BLUE);
            walker2.setTextColor(Color.BLUE);
            sneakers1.setTextColor(Color.BLUE);
            sneakers2.setTextColor(Color.BLUE);
            leatherOrSuede1.setTextColor(Color.BLUE);
            leatherOrSuede2.setTextColor(Color.BLUE);
            slipon1.setTextColor(Color.BLUE);
            slipon2.setTextColor(Color.BLUE);
            leatherSlipon1.setTextColor(Color.BLUE);
            leatherSlipon2.setTextColor(Color.BLUE);
        } else if (low<3) {
            loafer1.setText("출격\n(가죽이면)");
            loafer1.setGravity(Gravity.CENTER);
            loafer2.setText("출격\n(가죽이면)");
            loafer2.setGravity(Gravity.CENTER);
            shoes1.setText("출격");
            shoes2.setText("출격");
            sandal1.setText("퇴각");
            sandal2.setText("퇴각");
            boots1.setText("출격");
            boots2.setText("출격");
            walker1.setText("출격");
            walker2.setText("출격");
            sneakers1.setText("출격\n(양말 두껍게)");
            sneakers1.setGravity(Gravity.CENTER);
            sneakers2.setText("출격\n(양말 두껍게)");
            sneakers2.setGravity(Gravity.CENTER);
            leatherOrSuede1.setText("출격");
            leatherOrSuede2.setText("출격");
            slipon1.setText("출격\n(양말 두껍게)");
            slipon1.setGravity(Gravity.CENTER);
            slipon2.setText("출격\n(양말 두껍게)");
            slipon2.setGravity(Gravity.CENTER);
            leatherSlipon1.setText("출격");
            leatherSlipon2.setText("출격");

            loafer1.setTextColor(Color.BLUE);
            loafer2.setTextColor(Color.BLUE);
            shoes1.setTextColor(Color.BLUE);
            shoes2.setTextColor(Color.BLUE);
            sandal1.setTextColor(Color.RED);
            sandal2.setTextColor(Color.RED);
            boots1.setTextColor(Color.BLUE);
            boots2.setTextColor(Color.BLUE);
            walker1.setTextColor(Color.BLUE);
            walker2.setTextColor(Color.BLUE);
            sneakers1.setTextColor(Color.BLUE);
            sneakers2.setTextColor(Color.BLUE);
            leatherOrSuede1.setTextColor(Color.BLUE);
            leatherOrSuede2.setTextColor(Color.BLUE);
            slipon1.setTextColor(Color.BLUE);
            slipon2.setTextColor(Color.BLUE);
            leatherSlipon1.setTextColor(Color.BLUE);
            leatherSlipon2.setTextColor(Color.BLUE);
        }
    }
}



