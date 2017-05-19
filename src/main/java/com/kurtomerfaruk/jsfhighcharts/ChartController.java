package com.kurtomerfaruk.jsfhighcharts;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 18.12.2016 20:31:13
 * @blog http://kurtomerfaruk.com
 * @mail kurtomerfaruk@gmail.com
 */
@ManagedBean
@ViewScoped
public class ChartController implements java.io.Serializable {

    private static final long serialVersionUID = 3479985883495611426L;

    private String month;
    private String data;
    private List<Data> dataList;

    @PostConstruct
    public void init() {
        List<String> months = Arrays.asList("'Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'");
        List<Double> value = new ArrayList<>();

        dataList = new ArrayList<>();

        value = Arrays.asList(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6);
        dataList.add(new Data("Tokyo", value));
        value = Arrays.asList(-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5);
        dataList.add(new Data("New York", value));
        value = Arrays.asList(-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5);
        dataList.add(new Data("Berlin", value));
        value = Arrays.asList(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8);
        dataList.add(new Data("London", value));
        value = Arrays.asList(2.1, 1.1, 5.0, 9.0, 16.0, 34.0, 39.0, 42.0, 35.0, 27.2, 9.0, 6.0);
        dataList.add(new Data("Gaziantep", value));

        month = months.toString();
        data = new Gson().toJson(dataList);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

}
