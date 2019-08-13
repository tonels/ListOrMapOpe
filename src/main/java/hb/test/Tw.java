package hb.test;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.google.common.collect.Lists;
import hb.model.ColVideo;

import java.util.ArrayList;

public class Tw {
    public static void main(String[] args) {

        ColVideo colVideo = new ColVideo();
        colVideo.setAssetId(1L);
        colVideo.setGkId("ss");
        colVideo.setAssetId(1L);
        ArrayList<ColVideo> list = Lists.newArrayList(colVideo);
        JSONArray objects = JSONUtil.parseArray(list);
        System.out.println(objects);


    }



}
