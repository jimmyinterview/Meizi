package info.meizi.bean;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Created by Mr_Wrong on 15/9/22.
 */
public class TestContent extends RealmObject implements Serializable {
    private int imagewidth;
    private int imageheight;
    private String url;
    private int order;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


    public int getImageheight() {
        return imageheight;
    }

    public void setImageheight(int imageheight) {
        this.imageheight = imageheight;
    }

    public int getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(int imagewidth) {
        this.imagewidth = imagewidth;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;


}
