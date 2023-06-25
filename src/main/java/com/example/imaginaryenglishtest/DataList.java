package com.example.imaginaryenglishtest;

import java.util.ArrayList;

public class DataList {

    public static ArrayList<DataItem> dataList = new ArrayList<>();
    static {
        dataList.add(new DataItem("Adventure", "imagesGame/1.adventure.jpeg"));
        dataList.add(new DataItem("Magical", "imagesGame/2.magical.jpeg"));
        dataList.add(new DataItem("Fantastic", "imagesGame/3.fantastic.jpeg"));
        dataList.add(new DataItem("Discover", "imagesGame/4.discover.jpeg"));
        dataList.add(new DataItem("Hilarious", "imagesGame/5.hilarious.jpeg"));
        dataList.add(new DataItem("Mysterious", "imagesGame/6.mysterious.jpeg"));
        dataList.add(new DataItem("Curious", "imagesGame/7.curious.jpeg"));
        dataList.add(new DataItem("Friendly", "imagesGame/8.friendly.jpeg"));
        dataList.add(new DataItem("Delicious", "imagesGame/9.delicious.jpeg"));
        dataList.add(new DataItem("Colorful", "imagesGame/10.colorful.jpeg"));
        dataList.add(new DataItem("Creative", "imagesGame/11.creative.jpeg"));
        dataList.add(new DataItem("Imagine", "imagesGame/12.imagine.jpeg"));
        dataList.add(new DataItem("Explore", "imagesGame/13.explore.jpeg"));
        dataList.add(new DataItem("Cheerful", "imagesGame/14.cheerful.jpeg"));
        dataList.add(new DataItem("Unique", "imagesGame/15.unique.jpeg"));
        dataList.add(new DataItem("Playful", "imagesGame/16.playful.jpeg"));
        dataList.add(new DataItem("Celebrate", "imagesGame/17.celebrate.jpeg"));
        dataList.add(new DataItem("Surprise", "imagesGame/18.surprise.jpeg"));
        dataList.add(new DataItem("Laugh", "imagesGame/19.laugh.jpeg"));
        dataList.add(new DataItem("Dream", "imagesGame/20.dream.jpeg"));
        dataList.add(new DataItem("Brave", "imagesGame/21.brave.jpeg"));
        dataList.add(new DataItem("Friendship", "imagesGame/22.friendship.jpeg"));
        dataList.add(new DataItem("Learn", "imagesGame/23.learn.jpeg"));
        dataList.add(new DataItem("Play", "imagesGame/24.play.jpeg"));
        dataList.add(new DataItem("Teamwork", "imagesGame/25.teamwork.jpeg"));
        dataList.add(new DataItem("Caring", "imagesGame/26.caring.jpeg"));
        dataList.add(new DataItem("Gratitude", "imagesGame/27.gratitude.jpeg"));
        dataList.add(new DataItem("Wisdom", "imagesGame/28.wisdom.jpeg"));
        dataList.add(new DataItem("Growth", "imagesGame/29.growth.jpeg"));
        dataList.add(new DataItem("Culture", "imagesGame/30.culture.jpeg"));
    }


    public static class DataItem {
        private String name;
        private String path;

        public DataItem(String name, String path) {
            this.name = name;
            this.path = path;
        }

        public String getName() {
            return name;
        }

        public String getPath() {
            return path;
        }
    }
}
