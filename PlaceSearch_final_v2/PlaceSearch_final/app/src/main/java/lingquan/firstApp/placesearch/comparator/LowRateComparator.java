package lingquan.firstApp.placesearch.comparator;

import java.util.Comparator;

import lingquan.firstApp.placesearch.jsonscn.json2bean.Review;

public class LowRateComparator implements Comparator<Review> {
public int compare(Review r1,Review r2){
        return r1.getRating()-r2.getRating();
        }
}
