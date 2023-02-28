package com.sanket.stocktrack;

public class Constants {
    public static final String BASE_URL = "https://api.iextrading.com/1.0/stock/market/batch";
    public static final String SYMBOLS = "symbols";
    public static final String SYMBOLS_KEY = "aapl,msft,tsla,goog,nflx,intc,orcl,amzn,abmd,bsx,bdx,amid,aan";
    public static final String TYPES = "types";
    public static final String TYPES_KEY = "quote";
//    public static final String TYPES_KEY = "quote,news,chart";
    public static final String RANGE = "range";
    public static final String RANGE_KEY = "1m";
    public static final String LAST = "last";
    public static  final String LAST_KEY = "15";
    public static  final String NEWS_URL = "https://api.iextrading.com/1.0/stock/";
    public static final String NEWS_KEY = "news";
    public static final String CHART_KEY="chart";
//    https://api.iextrading.com/1.0/stock/aapl/chart/1m
    public static final String REF_URL = "https://api.iextrading.com/1.0/ref-data/symbols";
    public  static final String NEWS_SITES= "https://newsapi.org/v2/top-headlines";
    public static final String SOURCE_KEY= "sources";
    public static final String NEWS_API= BuildConfig.NEWS_API;
    public static final String KEY = "apiKey";
}
