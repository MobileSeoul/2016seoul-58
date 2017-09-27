package comcompletelee.naver.blog.codiforseoul;

import android.os.AsyncTask;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by hello world on 2016-10-25.
 */
public class WeatherContent extends AsyncTask<String, Void, Void> {

    private String SERVICE_KEY= "u8UqpwDnLxodjJPcJwDpK8ODsOmUCBHpUaUrTcIXH3DTXt%2BFp1EKmR%2FB7dReTT9XyqaBZQkwUZMvBMCsLGc2IQ%3D%3D";

    ArrayList<WeatherForecast> parseWeather = new ArrayList<WeatherForecast>();

    String XandY;

    String tagname="";
    String category="";
    String fcstValue="";

    WeatherForecast info;

    boolean flag=false;

    java.util.Calendar cal = java.util.Calendar.getInstance();

    String year = String.valueOf(cal.get ( cal.YEAR ));
    int month = cal.get ( cal.MONTH )+1;
    int date = cal.get ( cal.DATE );
    int hour = cal.get(cal.HOUR_OF_DAY);

    String str_month;
    String str_date;
    String baseDate;


    protected Void doInBackground(String... ID) {

        int iyear = Integer.valueOf(year);
        XandY = ID[0];
        //Log.i("ID_LOG",ID[0]);

        if(month<10) {
            str_month = "0"+String.valueOf(month);
        } else {
            str_month = String.valueOf(month);
        }

        if(date<10) {
            str_date = "0"+String.valueOf(date);
        } else {
            str_date = String.valueOf(date);
        }

        if(hour>5){
            baseDate = year+str_month+str_date;
        } else
        {
            if (month == 1 && date == 1) {
                baseDate = String.valueOf(iyear - 1) + "1231";
            } else if (month == 2 && date == 1) {
                baseDate = year + "0131";
            } else if (month == 3 && date == 1) {
                if ((iyear % 4 == 0) && (iyear % 100 != 0) || (iyear % 400 == 0)) { //윤년일 경우
                    baseDate = year + "0229";
                } else {
                    baseDate = year + "0228";
                }
            } else if (month == 4 && date == 1) {
                baseDate = year + "0331";
            } else if (month == 5 && date == 1) {
                baseDate = year + "0430";
            } else if (month == 6 && date == 1) {
                baseDate = year + "0531";
            } else if (month == 7 && date == 1) {
                baseDate = year + "0630";
            } else if (month == 8 && date == 1) {
                baseDate = year + "0731";
            } else if (month == 9 && date == 1) {
                baseDate = year + "0831";
            } else if (month == 10 && date == 1) {
                baseDate = year + "0930";
            } else if (month == 11 && date == 1) {
                baseDate = year + "1031";
            } else if (month == 12 && date == 1) {
                baseDate = year + "1130";
            } else {
                if(date<11) {
                    baseDate = year + str_month + "0"+String.valueOf(date-1);
                } else {
                    baseDate = year + str_month + String.valueOf(date-1);
                }
                //baseDate = year + str_month + String.valueOf(date-1);
            }
        }




        //Log.d("base_tag",baseDate);
        URL url;
        String url_str = "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?ServiceKey="+SERVICE_KEY+"&base_date="+baseDate+"&base_time=0500&"+XandY+"&numOfLows=10&numOfRows=252";

        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();
            url = new URL(url_str);
            InputStream in = url.openStream();
            xpp.setInput(in, "UTF-8");

            boolean high_flag=false;
            boolean low_flag=false;
            boolean pop_flag=false;

            int eventType = xpp.getEventType();
            info = new WeatherForecast();

            while (eventType != XmlPullParser.END_DOCUMENT) {

                if(eventType==XmlPullParser.START_TAG){
                    tagname = xpp.getName();
                    // Log.d("tag_log", tagname);

                } else if(eventType==XmlPullParser.TEXT){
                    if(tagname.equals("category")) {
                        category=xpp.getText();
                        //Log.d("category_tag", category);

                        if(category.equals("TMX")){
                            high_flag=true;
                        } else if(category.equals("TMN")) {
                            low_flag=true;
                        } else if(category.equals("POP")) {
                            pop_flag=true;
                        }
                    } else if(tagname.equals("fcstValue")&&high_flag){
                        fcstValue=xpp.getText();
                        //Log.d("high_tag", String.valueOf(high_flag));
                        info.high = (int) Double.parseDouble(fcstValue);
                        high_flag=false;

                    } else if(tagname.equals("fcstValue")&&low_flag) {
                        fcstValue=xpp.getText();
                        info.low = (int) Double.parseDouble(fcstValue);
                        low_flag=false;
                        //  Log.d("low_tag",  String.valueOf(info.low));
                    } else if (tagname.equals("fcstValue")&&pop_flag) {
                        fcstValue = xpp.getText();
                        info.pop = fcstValue;
                        pop_flag=false;
                    }
                }else if(eventType==XmlPullParser.END_TAG){
                    tagname = xpp.getName();
                    info.date=baseDate;
                    parseWeather.add(info);
                    tagname="";
                    category="";
                    fcstValue="";
                }
                eventType = xpp.next();
            }
            flag=true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
