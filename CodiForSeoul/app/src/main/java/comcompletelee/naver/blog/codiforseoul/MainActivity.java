package comcompletelee.naver.blog.codiforseoul;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_ANOTHER = 1001;
    public static final int RESULT_CODE = 100;
    String WOEID = "nx=60&ny=127";
    ArrayList<WeatherForecast> parseWeather = new ArrayList<WeatherForecast>();

    TextView dateTextView;
    TextView lowTextView;
    TextView highTextView;
    //TextView pop;
    WeatherForecast todayOuter;
    int low;
    int high;
    WeatherForecast today;

    ImageButton outer;
    ImageButton top;
    ImageButton bottom;
    ImageButton shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    protected void onResume(){
        super.onResume();




        WeatherContent weatherContent = new WeatherContent();
        weatherContent.execute(WOEID, null, null);

        while(true) {
            try {
                Thread.sleep(100);
                if(weatherContent.flag == true) {
                    parseWeather = weatherContent.parseWeather;

                    break;
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        today = parseWeather.get(0);


        dateTextView = (TextView) findViewById(R.id.dateTextView);
        lowTextView = (TextView) findViewById(R.id.lowTextView);
        lowTextView.setTextSize(70);
        highTextView = (TextView) findViewById(R.id.highTextView);
        highTextView.setTextSize(70);
        //pop = (TextView) findViewById(R.id.pop);

        //Log.d("today_log", today.getDate() + today.getLow()+ today.getHigh());

        dateTextView.setText(today.getDate());
        lowTextView.setText(String.valueOf(today.getLow()));
        highTextView.setText(String.valueOf(today.getHigh()));
        //pop.setText(today.getPop());

        outer = (ImageButton) findViewById(R.id.outer);
        outer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OuterTable.class);
                intent.putExtra("TODAY", today);

                startActivity(intent);
            }
        });

        top = (ImageButton) findViewById(R.id.top);
        top.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopTable.class);
                intent.putExtra("TODAY", today);

                startActivity(intent);
            }
        });

        bottom =(ImageButton) findViewById(R.id.bottom);
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BottomTable.class);
                intent.putExtra("TODAY", today);

                startActivity(intent);
            }
        });
        shoes = (ImageButton) findViewById(R.id.shoes);
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShoesTable.class);
                intent.putExtra("TODAY", today);

                startActivity(intent);
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
    }

}