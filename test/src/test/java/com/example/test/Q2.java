package com.example.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Q2 {
    static String data = "[\n" +
            "    {\n" +
            "        \"name\": \"新神榜：杨戬\",\n" +
            "            \"score\": \"7.0\",\n" +
            "            \"total\": \"41558\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"隐入尘烟\",\n" +
            "            \"score\": \"8.4\",\n" +
            "            \"total\": \"73335\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"忠犬帕尔玛\",\n" +
            "            \"score\": \"7.3\",\n" +
            "            \"total\": \"1282\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"760号犯人\",\n" +
            "            \"score\": \"7.3\",\n" +
            "            \"total\": \"3334\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"小黄人大眼萌：神偷奶爸前传\",\n" +
            "            \"score\": \"7.1\",\n" +
            "            \"total\": \"27055\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"神探大战\",\n" +
            "            \"score\": \"6.9\",\n" +
            "            \"total\": \"79613\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"明日战记\",\n" +
            "            \"score\": \"6.4\",\n" +
            "            \"total\": \"44086\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"独行月球\",\n" +
            "            \"score\": \"6.8\",\n" +
            "            \"total\": \"195962\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"断·桥\",\n" +
            "            \"score\": \"6.1\",\n" +
            "            \"total\": \"97382\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"人生大事\",\n" +
            "            \"score\": \"7.3\",\n" +
            "            \"total\": \"138794\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"name\": \"人间世\",\n" +
            "            \"score\": \"7.5\",\n" +
            "            \"total\": \"962\"\n" +
            "    }\n" +
            "    ]";

    public static void main(String[] args) throws JSONException {
        // 解析data（json格式）字符串
        // todo: 1、先按score排序，再按total排序，倒序打印出电影名称
        // todo: 2、输出score最高的电影名和total最高的电影名

        JSONArray jsonArray = new JSONArray(Q2.data);
        String[][] arrs=new String[jsonArray.length()][];
        for(int i=0;i< jsonArray.length();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String name=jsonObject.getString("name");
            String score= jsonObject.getString("score");
            String total=jsonObject.getString("total");
            String[] arr={name,score,total};
            arrs[i]=arr;
        }
        for(int i=0;i<arrs.length-1;i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {

                if (Double.parseDouble(arrs[j][1]) > Double.parseDouble(arrs[j + 1][1])) {
                    String[] temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }

        }
        System.out.println("score最高的电影："+arrs[0][0]);
        for(int i=0;i<arrs.length-1;i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {

                if (Double.parseDouble(arrs[j][2]) > Double.parseDouble(arrs[j + 1][2])) {
                    String[] temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }

        }
        System.out.println("total最高的电影："+arrs[0][0]);
        for (int i=arrs.length-1;i>=0;i--){
            System.out.println(i+"."+arrs[i][0]);
        }


//        System.out.println(arrs[0][2]);

    }
}
