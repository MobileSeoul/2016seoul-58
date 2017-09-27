package comcompletelee.naver.blog.codiforseoul;

import java.io.Serializable;

/**
 * Created by hello world on 2015-12-03.
 */
public class WeatherForecast implements Serializable {
    public int high;
    public int low;
    public String date;
    public String pop;

    public WeatherForecast() {

    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public String getDate() { return date;}

    public String getPop() {
        return pop;
    }
}
