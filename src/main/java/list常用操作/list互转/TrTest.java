package list常用操作.list互转;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.google.common.collect.Lists;
import list常用操作.list互转.model.Per;
import list常用操作.list互转.model.PerVo;
import list常用操作.list互转.model.SyncInfo;
import list常用操作.list互转.model.SyncRecordVo;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrTest {

    private static List<Per> list;

    static
    {
        LocalDateTime now = LocalDateTime.now();
        Per p1 = new Per().setPerId(1l).setAge(12).setName("tets").setBirth(now.minusDays(50)).setDeath(now.plusMonths(378));
        Per p2 = new Per().setPerId(2l).setAge(18).setName("tets2").setBirth(now.minusDays(25)).setDeath(now.plusMonths(358));
        Per p3 = new Per().setPerId(3l).setAge(15).setName("tets3").setBirth(now.minusDays(27)).setDeath(now.plusMonths(338));
        Per p4 = new Per().setPerId(4l).setAge(14).setName("tets4").setBirth(now.minusDays(37)).setDeath(now.plusMonths(348));
        list = Lists.newArrayList(p1,p2,p3,p4);
    }

    @Test
    public void Tes(){
        list.forEach(System.out::println);


        List<PerVo> collect1 = list.stream().map(e -> JSONUtil.toBean(JSONUtil.toJsonStr(e), PerVo.class)).collect(Collectors.toList());

        List<PerVo> collect = list.stream().map(e -> JSONUtil.toBean(JSONUtil.toJsonStr(e), PerVo.class)).collect(Collectors.toList());

        collect.forEach(System.out::println);


    }

    @Test
    public void RR(){
        SyncInfo s1 = new SyncInfo().setSyncInfoId(2l).setStartTime(LocalDateTime.now().minusHours(50l)).setSyncStatus("1").setAssetId(11L).setAssetName("ss").setGroupId(454L).setEndTime(LocalDateTime.now());
        SyncInfo s12 = new SyncInfo().setSyncInfoId(3l).setStartTime(LocalDateTime.now().minusHours(20l)).setSyncStatus("0").setAssetId(12L).setAssetName("ss").setGroupId(414L).setEndTime(LocalDateTime.now());
        ArrayList<SyncInfo> list = Lists.newArrayList(s1, s12);
        List<SyncRecordVo> collect = list.stream().map(e -> JSONUtil.toBean(JSONUtil.toJsonStr(e), SyncRecordVo.class)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void w(){
        JSONArray objects = JSONUtil.parseArray("[{\"syncInfoId\":1,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-21T11:07:07\",\"syncStatus\":\"1\"},{\"syncInfoId\":2,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-04-04T10:29:44\",\"endTime\":\"2019-08-18T10:30:07\",\"syncStatus\":\"1\"},{\"syncInfoId\":4,\"assetId\":1,\"groupId\":1,\"assetName\":\"test2\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-20T10:30:16\",\"syncStatus\":\"1\"},{\"syncInfoId\":5,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-23T10:30:20\",\"syncStatus\":\"1\"},{\"syncInfoId\":6,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-23T10:30:20\",\"syncStatus\":\"2\"},{\"syncInfoId\":7,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-23T10:30:20\",\"syncStatus\":\"1\"},{\"syncInfoId\":8,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-23T10:30:20\",\"syncStatus\":\"1\"},{\"syncInfoId\":9,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-23T10:30:20\",\"syncStatus\":\"1\"},{\"syncInfoId\":10,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2017-04-01T10:28:55\",\"endTime\":\"2019-08-23T10:30:20\",\"syncStatus\":\"1\"},{\"syncInfoId\":3,\"assetId\":2,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T11:29:26\",\"endTime\":\"2019-08-07T11:07:13\",\"syncStatus\":\"2\"}]");
//        List<SyncInfo> syncInfos = JSONUtil.toList(objects, SyncInfo.class);
//        syncInfos.forEach(System.out::println);

        List<SyncInfo> syncInfos2 =  new ArrayList<>();
        SyncInfo syncInfo = new SyncInfo();
        syncInfo.setSyncStatus("1");
        syncInfo.setStartTime(LocalDateTime.now());
        syncInfo.setGroupId(1L);
        syncInfo.setRemarks("sgag");
        syncInfos2.add(syncInfo);
        List<SyncRecordVo> collect = syncInfos2.stream().map(e -> JSONUtil.toBean(JSONUtil.toJsonStr(e), SyncRecordVo.class)).collect(Collectors.toList());

        collect.forEach(System.out::println);


    }

    @Test
    public void qq(){
        String a = "{\"syncInfoId\":1,\"assetId\":1,\"groupId\":1,\"assetName\":\"test1\",\"startTime\":\"2019-03-09T10:29:26\",\"endTime\":\"2019-08-21T11:07:07\",\"syncStatus\":\"1\"} ";

        SyncInfo syncInfo = JSONUtil.toBean(a, SyncInfo.class);

        SyncRecordVo syncRecordVo = JSONUtil.toBean(JSONUtil.toJsonStr(syncInfo), SyncRecordVo.class);
        System.out.println(syncRecordVo);

    }






}
