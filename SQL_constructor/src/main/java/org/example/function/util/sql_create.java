package org.example.function.util;
/**
 * @author yh
 */

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

public class sql_create {
    //    备注名在头部，顺序字段名
    public String sql_head_ps(String tablename, String[][] sql_field) {
        String SQL = "";
        for (int t = 0; t < sql_field.length; t++) {
            //头部
            SQL += "CREATE TABLE `" + tablename + t + "`  (\n";

            // 判断字段数组的长度
            int maxSqlField = sql_field[t].length;
            for (int i = 0; i < maxSqlField; i++) {
                SQL = SQL + "`A" + (i + 1) + "` varchar2(255) COMMENT '" + sql_field[t][i] + "',\n";
            }
            //尾部
            SQL = SQL + "`A" + (maxSqlField + 1) + "` varchar2(255)  COMMENT '" + sql_field[t][maxSqlField - 1] + "'\n"
                    + ") COMMENT= '1'; \n";

        }
        return SQL;

    }

    /**
     * <p></p>
     * @param  sql_field
     * @return SQL= 创表语句+备注语句
     */
    public String oracle_head_ps(String tablename, String[][] sql_field, int startLength) {
        String SQL = "";
        String remark = "";
        for (int t = 0; t < sql_field.length - 1; t++) {
            remark = "COMMENT ON TABLE " + tablename + (t + startLength) + " IS '" + sql_field[sql_field.length - 1][t] + "';\n"; //存储表备注

            SQL += "CREATE TABLE " + tablename + (t + startLength) + "  (\n";//创表语句头部

            int maxSqlField = sql_field[t].length;// 判断字段数组的长度
            for (int i = 0; i < maxSqlField - 1; i++) {
                //创表字段约束
                SQL = SQL + "A" + (i + 1) + " varchar2(255) ,\n";
                remark = remark + "COMMENT ON COLUMN " + tablename + (t + startLength) + "." + "A" + (i + 1) + " IS '" + sql_field[t][i] + "';\n";
            }

            //表和字段备注相加
            remark = remark + "COMMENT ON COLUMN " + tablename + (t + startLength) + "." + "A" + (maxSqlField) + " IS '" + sql_field[t][maxSqlField - 1] + "';\n";
            SQL += "A" + (maxSqlField) + " varchar2(255) );\n" + remark;//创表尾部
        }
        return SQL;
    }

}
