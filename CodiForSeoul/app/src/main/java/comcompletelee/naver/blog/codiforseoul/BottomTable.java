package comcompletelee.naver.blog.codiforseoul;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;



/**
 * Created by hello world on 2016-01-10.
 */
public class BottomTable extends Activity {

    TextView shortPants1;
    TextView shortPants2;
    TextView joggerPants1;
    TextView joggerPants2;
    TextView coatingJean1;
    TextView coatingJean2;
    TextView nappingPants1;
    TextView nappingPants2;
    TextView washingJean1;
    TextView washingJean2;
    TextView rawJean1;
    TextView rawJean2;
    TextView lynenPants1;
    TextView lynenPants2;
    TextView slacks1;
    TextView slacks2;
    TextView woolSlacks1;
    TextView woolSlacks2;
    TextView chino1;
    TextView chino2;
    TextView salStocking1;
    TextView salStocking2;
    TextView blackStocking1;
    TextView blackStocking2;
    TextView leggings1;
    TextView leggings2;
    TextView skirt1;
    TextView skirt2;
    TextView jeanSkirt1;
    TextView jeanSkirt2;
    TextView heavySkirt1;
    TextView heavySkirt2;

    WeatherForecast todayOuter;
    int high;
    int low;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom);



        Intent intent = getIntent();

        todayOuter = (WeatherForecast) intent.getSerializableExtra("TODAY");


        shortPants1 = (TextView) findViewById(R.id.shortPants1);
        shortPants2 = (TextView) findViewById(R.id.shortPants2);
        joggerPants1 = (TextView) findViewById(R.id.joggerPants1);
        joggerPants2 = (TextView) findViewById(R.id.joggerPants2);
        coatingJean1 = (TextView) findViewById(R.id.coatingJean1);
        coatingJean2 = (TextView) findViewById(R.id.coatingJean2);
        nappingPants1 = (TextView) findViewById(R.id.nappingPants1);
        nappingPants2 = (TextView) findViewById(R.id.nappingPants2);
        washingJean1 = (TextView) findViewById(R.id.washingJean1);
        washingJean2 = (TextView) findViewById(R.id.washingJean2);
        rawJean1 = (TextView) findViewById(R.id.rawJean1);
        rawJean2 = (TextView) findViewById(R.id.rawJean2);
        lynenPants1 = (TextView) findViewById(R.id.lynenPants1);
        lynenPants2 = (TextView) findViewById(R.id.lynenPants2);
        slacks1 = (TextView) findViewById(R.id.slacks1);
        slacks2 = (TextView) findViewById(R.id.slacks2);
        woolSlacks1 = (TextView) findViewById(R.id.woolSlacks1);
        woolSlacks2 = (TextView) findViewById(R.id.woolSlacks2);
        chino1 = (TextView) findViewById(R.id.chino1);
        chino2 = (TextView) findViewById(R.id.chino2);
        salStocking1 = (TextView) findViewById(R.id.salStocking1);
        salStocking2 = (TextView) findViewById(R.id.salStocking2);
        blackStocking1 = (TextView) findViewById(R.id.blackStocking1);
        blackStocking2 = (TextView) findViewById(R.id.blackStocking2);
        leggings1 = (TextView) findViewById(R.id.leggings1);
        leggings2 = (TextView) findViewById(R.id.leggings2);
        skirt1 = (TextView) findViewById(R.id.skirt1);
        skirt2 = (TextView) findViewById(R.id.skirt2);
        jeanSkirt1 = (TextView) findViewById(R.id.jeanSkirt1);
        jeanSkirt2 = (TextView) findViewById(R.id.jeanSkirt2);
        heavySkirt1 = (TextView) findViewById(R.id.heavySkirt1);
        heavySkirt2 = (TextView) findViewById(R.id.heavySkirt2);

        low = todayOuter.getLow();
        high = todayOuter.getHigh();




        if (low >= 20)/*여름*/ {
            shortPants1.setText("출격");
            shortPants2.setText("출격");
            joggerPants1.setText("출격");
            joggerPants2.setText("출격");
            coatingJean1.setText("출격\n(더움 주의)");
            coatingJean1.setGravity(Gravity.CENTER);
            coatingJean2.setText("출격\n(더움 주의)");
            coatingJean2.setGravity(Gravity.CENTER);
            nappingPants1.setText("퇴각");
            nappingPants2.setText("퇴각");
            washingJean1.setText("출격");
            washingJean2.setText("출격");
            rawJean1.setText("출격\n(더움 주의)");
            rawJean1.setGravity(Gravity.CENTER);
            rawJean2.setText("출격\n(더움 주의)");
            rawJean2.setGravity(Gravity.CENTER);
            lynenPants1.setText("출격");
            lynenPants2.setText("출격");
            slacks1.setText("출격");
            slacks2.setText("출격");
            woolSlacks1.setText("퇴각");
            woolSlacks2.setText("퇴각");
            chino1.setText("출격");
            chino2.setText("출격");
            salStocking1.setText("퇴각");
            salStocking2.setText("퇴각");
            blackStocking1.setText("퇴각");
            blackStocking2.setText("퇴각");
            leggings1.setText("퇴각");
            leggings2.setText("퇴각");

            skirt1.setText("출격");
            skirt2.setText("출격");
            jeanSkirt1.setText("출격");
            jeanSkirt2.setText("출격");
            heavySkirt1.setText("퇴각");
            heavySkirt2.setText("퇴각");

            skirt1.setTextColor(Color.BLUE);
            skirt2.setTextColor(Color.BLUE);
            jeanSkirt1.setTextColor(Color.BLUE);
            jeanSkirt2.setTextColor(Color.BLUE);
            heavySkirt1.setTextColor(Color.RED);
            heavySkirt2.setTextColor(Color.RED);

            shortPants1.setTextColor(Color.BLUE);
            shortPants2.setTextColor(Color.BLUE);
            joggerPants1.setTextColor(Color.BLUE);
            joggerPants2.setTextColor(Color.BLUE);
            coatingJean1.setTextColor(Color.BLUE);
            coatingJean2.setTextColor(Color.BLUE);
            nappingPants1.setTextColor(Color.RED);
            nappingPants2.setTextColor(Color.RED);
            washingJean1.setTextColor(Color.BLUE);
            washingJean2.setTextColor(Color.BLUE);
            rawJean1.setTextColor(Color.BLUE);
            rawJean2.setTextColor(Color.BLUE);
            lynenPants1.setTextColor(Color.BLUE);
            lynenPants2.setTextColor(Color.BLUE);
            slacks1.setTextColor(Color.BLUE);
            slacks2.setTextColor(Color.BLUE);
            woolSlacks1.setTextColor(Color.RED);
            woolSlacks2.setTextColor(Color.RED);
            chino1.setTextColor(Color.BLUE);
            chino2.setTextColor(Color.BLUE);
            salStocking1.setTextColor(Color.RED);
            salStocking2.setTextColor(Color.RED);
            blackStocking1.setTextColor(Color.RED);
            blackStocking2.setTextColor(Color.RED);
            leggings1.setTextColor(Color.RED);
            leggings2.setTextColor(Color.RED);

        } else if (low >= 15 && low < 20)/*초여름, 늦여름*/ {
            shortPants1.setText("출격");
            shortPants2.setText("출격");
            joggerPants1.setText("출격");
            joggerPants2.setText("출격");
            coatingJean1.setText("출격");
            coatingJean2.setText("출격");
            nappingPants1.setText("퇴각");
            nappingPants2.setText("퇴각");
            washingJean1.setText("출격");
            washingJean2.setText("출격");
            rawJean1.setText("출격");
            rawJean2.setText("출격");
            lynenPants1.setText("출격");
            lynenPants2.setText("출격");
            slacks1.setText("출격");
            slacks2.setText("출격");
            woolSlacks1.setText("퇴각");
            woolSlacks2.setText("퇴각");
            chino1.setText("출격");
            chino2.setText("출격");
            salStocking1.setText("얇으면 가능\n(발냄새 주의)");
            salStocking1.setGravity(Gravity.CENTER);
            salStocking2.setText("얇으면 가능\n(발냄새 주의)");
            salStocking2.setGravity(Gravity.CENTER);
            blackStocking1.setText("퇴각");
            blackStocking2.setText("퇴각");
            leggings1.setText("퇴각");
            leggings2.setText("퇴각");

            skirt1.setText("출격");
            skirt2.setText("출격");
            jeanSkirt1.setText("출격");
            jeanSkirt2.setText("출격");
            heavySkirt1.setText("퇴각");
            heavySkirt2.setText("퇴각");

            skirt1.setTextColor(Color.BLUE);
            skirt2.setTextColor(Color.BLUE);
            jeanSkirt1.setTextColor(Color.BLUE);
            jeanSkirt2.setTextColor(Color.BLUE);
            heavySkirt1.setTextColor(Color.RED);
            heavySkirt2.setTextColor(Color.RED);

            shortPants1.setTextColor(Color.BLUE);
            shortPants2.setTextColor(Color.BLUE);
            joggerPants1.setTextColor(Color.BLUE);
            joggerPants2.setTextColor(Color.BLUE);
            coatingJean1.setTextColor(Color.BLUE);
            coatingJean2.setTextColor(Color.BLUE);
            nappingPants1.setTextColor(Color.RED);
            nappingPants2.setTextColor(Color.RED);
            washingJean1.setTextColor(Color.BLUE);
            washingJean2.setTextColor(Color.BLUE);
            rawJean1.setTextColor(Color.BLUE);
            rawJean2.setTextColor(Color.BLUE);
            lynenPants1.setTextColor(Color.BLUE);
            lynenPants2.setTextColor(Color.BLUE);
            slacks1.setTextColor(Color.BLUE);
            slacks2.setTextColor(Color.BLUE);
            woolSlacks1.setTextColor(Color.RED);
            woolSlacks2.setTextColor(Color.RED);
            chino1.setTextColor(Color.BLUE);
            chino2.setTextColor(Color.BLUE);
            salStocking1.setTextColor(Color.BLUE);
            salStocking2.setTextColor(Color.BLUE);
            blackStocking1.setTextColor(Color.RED);
            blackStocking2.setTextColor(Color.RED);
            leggings1.setTextColor(Color.RED);
            leggings2.setTextColor(Color.RED);

        } else if(low>=5&&low<15)/*환절기*/{
            if(high>=22)/*여름에 가깝*/{
                shortPants1.setText("출격");
                shortPants2.setText("출격");
                joggerPants1.setText("출격");
                joggerPants2.setText("출격");
                coatingJean1.setText("출격");
                coatingJean1.setGravity(Gravity.CENTER);
                coatingJean2.setText("출격");
                coatingJean2.setGravity(Gravity.CENTER);
                nappingPants1.setText("퇴각");
                nappingPants2.setText("퇴각");
                washingJean1.setText("출격");
                washingJean2.setText("출격");
                rawJean1.setText("출격\n(더움 주의)");
                rawJean1.setGravity(Gravity.CENTER);
                rawJean2.setText("출격\n(더움 주의)");
                rawJean2.setGravity(Gravity.CENTER);
                lynenPants1.setText("출격");
                lynenPants2.setText("출격");
                slacks1.setText("출격");
                slacks2.setText("출격");
                woolSlacks1.setText("퇴각");
                woolSlacks2.setText("퇴각");
                chino1.setText("출격");
                chino2.setText("출격");
                salStocking1.setText("출격\n(발냄새 주의)");
                salStocking1.setGravity(Gravity.CENTER);
                salStocking2.setText("출격\n(발냄새 주의");
                salStocking2.setGravity(Gravity.CENTER);
                blackStocking1.setText("퇴각");
                blackStocking2.setText("퇴각");
                leggings1.setText("퇴각");
                leggings2.setText("퇴각");

                skirt1.setText("출격");
                skirt2.setText("출격");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("퇴각");
                heavySkirt2.setText("퇴각");

                skirt1.setTextColor(Color.BLUE);
                skirt2.setTextColor(Color.BLUE);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.RED);
                heavySkirt2.setTextColor(Color.RED);

                shortPants1.setTextColor(Color.BLUE);
                shortPants2.setTextColor(Color.BLUE);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.RED);
                nappingPants2.setTextColor(Color.RED);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.BLUE);
                lynenPants2.setTextColor(Color.BLUE);
                slacks1.setTextColor(Color.BLUE);
                slacks2.setTextColor(Color.BLUE);
                woolSlacks1.setTextColor(Color.RED);
                woolSlacks2.setTextColor(Color.RED);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.BLUE);
                salStocking2.setTextColor(Color.BLUE);
                blackStocking1.setTextColor(Color.RED);
                blackStocking2.setTextColor(Color.RED);
                leggings1.setTextColor(Color.RED);
                leggings2.setTextColor(Color.RED);

            } else if(high>=10&&high<22) {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격");
                joggerPants2.setText("출격");
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("퇴각");
                nappingPants2.setText("퇴각");
                washingJean1.setText("출격");
                washingJean2.setText("출격");
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("출격");
                lynenPants2.setText("출격");
                slacks1.setText("출격");
                slacks2.setText("출격");
                woolSlacks1.setText("퇴각");
                woolSlacks2.setText("퇴각");
                chino1.setText("출격");
                chino2.setText("출격");
                salStocking1.setText("출격");
                salStocking2.setText("출격");
                blackStocking1.setText("퇴각");
                blackStocking2.setText("퇴각");
                leggings1.setText("퇴각");
                leggings2.setText("퇴각");

                skirt1.setText("출격");
                skirt2.setText("출격");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("퇴각");
                heavySkirt2.setText("퇴각");

                skirt1.setTextColor(Color.BLUE);
                skirt2.setTextColor(Color.BLUE);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.RED);
                heavySkirt2.setTextColor(Color.RED);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.RED);
                nappingPants2.setTextColor(Color.RED);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.BLUE);
                lynenPants2.setTextColor(Color.BLUE);
                slacks1.setTextColor(Color.BLUE);
                slacks2.setTextColor(Color.BLUE);
                woolSlacks1.setTextColor(Color.RED);
                woolSlacks2.setTextColor(Color.RED);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.BLUE);
                salStocking2.setTextColor(Color.BLUE);
                blackStocking1.setTextColor(Color.RED);
                blackStocking2.setTextColor(Color.RED);
                leggings1.setTextColor(Color.RED);
                leggings2.setTextColor(Color.RED);

            } else if (high<10&&high>=8) /*초겨울*/ {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격");
                joggerPants2.setText("출격");
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("퇴각");
                nappingPants2.setText("퇴각");
                washingJean1.setText("출격");
                washingJean2.setText("출격");
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("출격");
                slacks2.setText("출격");
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격");
                chino2.setText("출격");
                salStocking1.setText("출격");
                salStocking2.setText("출격");
                blackStocking1.setText("출격(60D)");
                blackStocking2.setText("출격(60D)");
                leggings1.setText("퇴각");
                leggings2.setText("퇴각");

                skirt1.setText("출격");
                skirt2.setText("출격");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.BLUE);
                skirt2.setTextColor(Color.BLUE);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.RED);
                nappingPants2.setTextColor(Color.RED);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.BLUE);
                slacks2.setTextColor(Color.BLUE);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.BLUE);
                salStocking2.setTextColor(Color.BLUE);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.RED);
                leggings2.setTextColor(Color.RED);

            } else if (high<8)/*겨울*/ {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격");
                joggerPants2.setText("출격");
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("출격");
                nappingPants2.setText("출격");
                washingJean1.setText("출격");
                washingJean2.setText("출격");
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("출격");
                slacks2.setText("출격");
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격");
                chino2.setText("출격");
                salStocking1.setText("퇴각");
                salStocking2.setText("퇴각");
                blackStocking1.setText("출격");
                blackStocking2.setText("출격");
                leggings1.setText("출격");
                leggings2.setText("출격");

                skirt1.setText("출격");
                skirt2.setText("출격");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.BLUE);
                skirt2.setTextColor(Color.BLUE);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.BLUE);
                nappingPants2.setTextColor(Color.BLUE);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.BLUE);
                slacks2.setTextColor(Color.BLUE);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.RED);
                salStocking2.setTextColor(Color.RED);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.BLUE);
                leggings2.setTextColor(Color.BLUE);

            }
        } else if(low<5&&low>=0) /*겨울*/{

            if(high>12) {//봄되가떄
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격");
                joggerPants2.setText("출격");
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("출격");
                nappingPants2.setText("출격");
                washingJean1.setText("출격");
                washingJean2.setText("출격");
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("출격");
                slacks1.setGravity(Gravity.CENTER);
                slacks2.setText("출격");
                slacks2.setGravity(Gravity.CENTER);
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격");
                chino2.setText("출격");
                salStocking1.setText("출격\n(추워보일지도)");
                salStocking2.setText("출격\n(추워보일지도)");
                blackStocking1.setText("출격");
                blackStocking2.setText("출격");
                leggings1.setText("출격");
                leggings2.setText("출격");

                salStocking1.setGravity(Gravity.CENTER);
                salStocking2.setGravity(Gravity.CENTER);

                skirt1.setText("출격");
                skirt2.setText("출격");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.BLUE);
                skirt2.setTextColor(Color.BLUE);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.BLUE);
                shortPants2.setTextColor(Color.BLUE);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.BLUE);
                nappingPants2.setTextColor(Color.BLUE);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.BLUE);
                slacks2.setTextColor(Color.BLUE);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.BLUE);
                salStocking2.setTextColor(Color.BLUE);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.BLUE);
                leggings2.setTextColor(Color.BLUE);
            }

            shortPants1.setText("퇴각");
            shortPants2.setText("퇴각");
            joggerPants1.setText("출격");
            joggerPants2.setText("출격");
            coatingJean1.setText("출격");
            coatingJean2.setText("출격");
            nappingPants1.setText("출격");
            nappingPants2.setText("출격");
            washingJean1.setText("출격");
            washingJean2.setText("출격");
            rawJean1.setText("출격");
            rawJean2.setText("출격");
            lynenPants1.setText("퇴각");
            lynenPants2.setText("퇴각");
            slacks1.setText("출격\n(with 타이즈)");
            slacks1.setGravity(Gravity.CENTER);
            slacks2.setText("출격\n(with 타이즈)");
            slacks2.setGravity(Gravity.CENTER);
            woolSlacks1.setText("출격");
            woolSlacks2.setText("출격");
            chino1.setText("출격");
            chino2.setText("출격");
            salStocking1.setText("퇴각");
            salStocking2.setText("퇴각");
            blackStocking1.setText("출격");
            blackStocking2.setText("출격");
            leggings1.setText("출격");
            leggings2.setText("출격");

            skirt1.setText("출격");
            skirt2.setText("출격");
            jeanSkirt1.setText("출격");
            jeanSkirt2.setText("출격");
            heavySkirt1.setText("출격");
            heavySkirt2.setText("출격");

            skirt1.setTextColor(Color.BLUE);
            skirt2.setTextColor(Color.BLUE);
            jeanSkirt1.setTextColor(Color.BLUE);
            jeanSkirt2.setTextColor(Color.BLUE);
            heavySkirt1.setTextColor(Color.BLUE);
            heavySkirt2.setTextColor(Color.BLUE);

            shortPants1.setTextColor(Color.RED);
            shortPants2.setTextColor(Color.RED);
            joggerPants1.setTextColor(Color.BLUE);
            joggerPants2.setTextColor(Color.BLUE);
            coatingJean1.setTextColor(Color.BLUE);
            coatingJean2.setTextColor(Color.BLUE);
            nappingPants1.setTextColor(Color.BLUE);
            nappingPants2.setTextColor(Color.BLUE);
            washingJean1.setTextColor(Color.BLUE);
            washingJean2.setTextColor(Color.BLUE);
            rawJean1.setTextColor(Color.BLUE);
            rawJean2.setTextColor(Color.BLUE);
            lynenPants1.setTextColor(Color.RED);
            lynenPants2.setTextColor(Color.RED);
            slacks1.setTextColor(Color.BLUE);
            slacks2.setTextColor(Color.BLUE);
            woolSlacks1.setTextColor(Color.BLUE);
            woolSlacks2.setTextColor(Color.BLUE);
            chino1.setTextColor(Color.BLUE);
            chino2.setTextColor(Color.BLUE);
            salStocking1.setTextColor(Color.RED);
            salStocking2.setTextColor(Color.RED);
            blackStocking1.setTextColor(Color.BLUE);
            blackStocking2.setTextColor(Color.BLUE);
            leggings1.setTextColor(Color.BLUE);
            leggings2.setTextColor(Color.BLUE);

        } else if (low<0&&low>=-6) /*한겨울*/ {

            if(high>=12) {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격");
                joggerPants2.setText("출격");
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("출격");
                nappingPants2.setText("출격");
                washingJean1.setText("출격");
                washingJean2.setText("출격");
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("출격");
                slacks1.setGravity(Gravity.CENTER);
                slacks2.setText("출격");
                slacks2.setGravity(Gravity.CENTER);
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격");
                chino2.setText("출격");
                salStocking1.setText("출격\n(추워보일지도)");
                salStocking2.setText("출격\n(추워보일지도)");
                salStocking1.setGravity(Gravity.CENTER);
                salStocking2.setGravity(Gravity.CENTER);
                blackStocking1.setText("출격");
                blackStocking2.setText("출격");
                leggings1.setText("출격");
                leggings2.setText("출격");

                skirt1.setText("출격");
                skirt2.setText("출격");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.BLUE);
                skirt2.setTextColor(Color.BLUE);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.BLUE);
                nappingPants2.setTextColor(Color.BLUE);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.BLUE);
                slacks2.setTextColor(Color.BLUE);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.BLUE);
                salStocking2.setTextColor(Color.BLUE);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.BLUE);
                leggings2.setTextColor(Color.BLUE);
            } else if(high<12&&high>2) {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격\n" +
                        "(with 타이즈)");
                joggerPants1.setGravity(Gravity.CENTER);
                joggerPants2.setText("출격\n" +
                        "(with 타이즈)");
                joggerPants2.setGravity(Gravity.CENTER);
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("출격");
                nappingPants2.setText("출격");
                washingJean1.setText("출격\n" +
                        "(with 타이즈)");
                washingJean1.setGravity(Gravity.CENTER);
                washingJean2.setText("출격\n" +
                        "(with 타이즈)");
                washingJean2.setGravity(Gravity.CENTER);
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("퇴각");
                slacks2.setText("퇴각");
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격\n" +
                        "(with 타이즈)");
                chino1.setGravity(Gravity.CENTER);
                chino2.setText("출격\n" +
                        "(with 타이즈)");
                chino2.setGravity(Gravity.CENTER);
                salStocking1.setText("퇴각");
                salStocking2.setText("퇴각");
                blackStocking1.setText("출격");
                blackStocking2.setText("출격");
                leggings1.setText("출격\n(기모필수)");
                leggings1.setGravity(Gravity.CENTER);
                leggings2.setText("출격\n(기모필수)");
                leggings2.setGravity(Gravity.CENTER);

                skirt1.setText("퇴각");
                skirt2.setText("퇴각");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.RED);
                skirt2.setTextColor(Color.RED);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.BLUE);
                nappingPants2.setTextColor(Color.BLUE);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.RED);
                slacks2.setTextColor(Color.RED);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.RED);
                salStocking2.setTextColor(Color.RED);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.BLUE);
                leggings2.setTextColor(Color.BLUE);
            } else {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격\n" +
                        "(with 타이즈)");
                joggerPants1.setGravity(Gravity.CENTER);
                joggerPants2.setText("출격\n" +
                        "(with 타이즈)");
                joggerPants2.setGravity(Gravity.CENTER);
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("출격");
                nappingPants2.setText("출격");
                washingJean1.setText("출격\n" +
                        "(with 타이즈)");
                washingJean1.setGravity(Gravity.CENTER);
                washingJean2.setText("출격\n" +
                        "(with 타이즈)");
                washingJean2.setGravity(Gravity.CENTER);
                rawJean1.setText("출격\n" +
                        "(with 타이즈)");
                rawJean1.setGravity(Gravity.CENTER);
                rawJean2.setText("출격\n" +
                        "(with 타이즈)");
                rawJean2.setGravity(Gravity.CENTER);
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("퇴각");
                slacks2.setText("퇴각");
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격\n" +
                        "(with 타이즈)");
                chino1.setGravity(Gravity.CENTER);
                chino2.setText("출격\n" +
                        "(with 타이즈)");
                chino2.setGravity(Gravity.CENTER);
                salStocking1.setText("퇴각");
                salStocking2.setText("퇴각");
                blackStocking1.setText("출격\n(두꺼운걸로)");
                blackStocking1.setGravity(Gravity.CENTER);
                blackStocking2.setText("출격\n(두꺼운걸로)");
                blackStocking2.setGravity(Gravity.CENTER);
                leggings1.setText("출격");
                leggings2.setText("출격");

                skirt1.setText("퇴각");
                skirt2.setText("퇴각");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.RED);
                skirt2.setTextColor(Color.RED);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.BLUE);
                nappingPants2.setTextColor(Color.BLUE);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.RED);
                slacks2.setTextColor(Color.RED);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.RED);
                salStocking2.setTextColor(Color.RED);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.BLUE);
                leggings2.setTextColor(Color.BLUE);
            }

        } else if( low < -6) /*한파, 졸라추울떄*/{
            shortPants1.setText("퇴각");
            shortPants2.setText("퇴각");
            joggerPants1.setText("출격\n" +
                    "(with 타이즈)");
            joggerPants1.setGravity(Gravity.CENTER);
            joggerPants2.setText("출격\n" +
                    "(with 타이즈)");
            joggerPants2.setGravity(Gravity.CENTER);
            coatingJean1.setText("출격");
            coatingJean2.setText("출격");
            nappingPants1.setText("출격");
            nappingPants2.setText("출격");
            washingJean1.setText("출격\n" +
                    "(with 타이즈)");
            washingJean1.setGravity(Gravity.CENTER);
            washingJean2.setText("출격\n" +
                    "(with 타이즈)");
            washingJean2.setGravity(Gravity.CENTER);
            rawJean1.setText("출격");
            rawJean2.setText("출격");
            lynenPants1.setText("퇴각");
            lynenPants2.setText("퇴각");
            slacks1.setText("퇴각");
            slacks2.setText("퇴각");
            woolSlacks1.setText("출격");
            woolSlacks2.setText("출격");
            chino1.setText("출격\n" +
                    "(with 타이즈)");
            chino1.setGravity(Gravity.CENTER);
            chino2.setText("출격\n" +
                    "(with 타이즈)");
            chino2.setGravity(Gravity.CENTER);
            salStocking1.setText("퇴각");
            salStocking2.setText("퇴각");
            blackStocking1.setText("퇴각");
            blackStocking2.setText("퇴각");
            leggings1.setText("출격\n(기모필수)");
            leggings1.setGravity(Gravity.CENTER);
            leggings2.setText("출격\n(기모필수)");
            leggings2.setGravity(Gravity.CENTER);

            skirt1.setText("퇴각");
            skirt2.setText("퇴각");
            jeanSkirt1.setText("출격");
            jeanSkirt2.setText("출격");
            heavySkirt1.setText("출격");
            heavySkirt2.setText("출격");

            skirt1.setTextColor(Color.RED);
            skirt2.setTextColor(Color.RED);
            jeanSkirt1.setTextColor(Color.BLUE);
            jeanSkirt2.setTextColor(Color.BLUE);
            heavySkirt1.setTextColor(Color.BLUE);
            heavySkirt2.setTextColor(Color.BLUE);

            shortPants1.setTextColor(Color.RED);
            shortPants2.setTextColor(Color.RED);
            joggerPants1.setTextColor(Color.BLUE);
            joggerPants2.setTextColor(Color.BLUE);
            coatingJean1.setTextColor(Color.BLUE);
            coatingJean2.setTextColor(Color.BLUE);
            nappingPants1.setTextColor(Color.BLUE);
            nappingPants2.setTextColor(Color.BLUE);
            washingJean1.setTextColor(Color.BLUE);
            washingJean2.setTextColor(Color.BLUE);
            rawJean1.setTextColor(Color.BLUE);
            rawJean2.setTextColor(Color.BLUE);
            lynenPants1.setTextColor(Color.RED);
            lynenPants2.setTextColor(Color.RED);
            slacks1.setTextColor(Color.RED);
            slacks2.setTextColor(Color.RED);
            woolSlacks1.setTextColor(Color.BLUE);
            woolSlacks2.setTextColor(Color.BLUE);
            chino1.setTextColor(Color.BLUE);
            chino2.setTextColor(Color.BLUE);
            salStocking1.setTextColor(Color.RED);
            salStocking2.setTextColor(Color.RED);
            blackStocking1.setTextColor(Color.RED);
            blackStocking2.setTextColor(Color.RED);
            leggings1.setTextColor(Color.BLUE);
            leggings2.setTextColor(Color.BLUE);

            if(high>2) {
                shortPants1.setText("퇴각");
                shortPants2.setText("퇴각");
                joggerPants1.setText("출격\n" +
                        "(with 타이즈)");
                joggerPants1.setGravity(Gravity.CENTER);
                joggerPants2.setText("출격\n" +
                        "(with 타이즈)");
                joggerPants2.setGravity(Gravity.CENTER);
                coatingJean1.setText("출격");
                coatingJean2.setText("출격");
                nappingPants1.setText("출격");
                nappingPants2.setText("출격");
                washingJean1.setText("출격\n" +
                        "(with 타이즈)");
                washingJean1.setGravity(Gravity.CENTER);
                washingJean2.setText("출격\n" +
                        "(with 타이즈)");
                washingJean2.setGravity(Gravity.CENTER);
                rawJean1.setText("출격");
                rawJean2.setText("출격");
                lynenPants1.setText("퇴각");
                lynenPants2.setText("퇴각");
                slacks1.setText("퇴각");
                slacks2.setText("퇴각");
                woolSlacks1.setText("출격");
                woolSlacks2.setText("출격");
                chino1.setText("출격\n" +
                        "(with 타이즈)");
                chino1.setGravity(Gravity.CENTER);
                chino2.setText("출격\n" +
                        "(with 타이즈)");
                chino2.setGravity(Gravity.CENTER);
                salStocking1.setText("퇴각");
                salStocking2.setText("퇴각");
                blackStocking1.setText("출격");
                blackStocking2.setText("출격");
                leggings1.setText("출격\n(기모필수)");
                leggings1.setGravity(Gravity.CENTER);
                leggings2.setText("출격\n(기모필수)");
                leggings2.setGravity(Gravity.CENTER);

                skirt1.setText("퇴각");
                skirt2.setText("퇴각");
                jeanSkirt1.setText("출격");
                jeanSkirt2.setText("출격");
                heavySkirt1.setText("출격");
                heavySkirt2.setText("출격");

                skirt1.setTextColor(Color.RED);
                skirt2.setTextColor(Color.RED);
                jeanSkirt1.setTextColor(Color.BLUE);
                jeanSkirt2.setTextColor(Color.BLUE);
                heavySkirt1.setTextColor(Color.BLUE);
                heavySkirt2.setTextColor(Color.BLUE);

                shortPants1.setTextColor(Color.RED);
                shortPants2.setTextColor(Color.RED);
                joggerPants1.setTextColor(Color.BLUE);
                joggerPants2.setTextColor(Color.BLUE);
                coatingJean1.setTextColor(Color.BLUE);
                coatingJean2.setTextColor(Color.BLUE);
                nappingPants1.setTextColor(Color.BLUE);
                nappingPants2.setTextColor(Color.BLUE);
                washingJean1.setTextColor(Color.BLUE);
                washingJean2.setTextColor(Color.BLUE);
                rawJean1.setTextColor(Color.BLUE);
                rawJean2.setTextColor(Color.BLUE);
                lynenPants1.setTextColor(Color.RED);
                lynenPants2.setTextColor(Color.RED);
                slacks1.setTextColor(Color.RED);
                slacks2.setTextColor(Color.RED);
                woolSlacks1.setTextColor(Color.BLUE);
                woolSlacks2.setTextColor(Color.BLUE);
                chino1.setTextColor(Color.BLUE);
                chino2.setTextColor(Color.BLUE);
                salStocking1.setTextColor(Color.RED);
                salStocking2.setTextColor(Color.RED);
                blackStocking1.setTextColor(Color.BLUE);
                blackStocking2.setTextColor(Color.BLUE);
                leggings1.setTextColor(Color.BLUE);
                leggings2.setTextColor(Color.BLUE);
            }
        }
    }

}