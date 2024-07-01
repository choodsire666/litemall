package com.choodsire666.litemall.db.mybatis;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 谢金成
 * @date 2024/7/1 22:15
 */
public class JsonStringArrayTypeHandler extends BaseTypeHandler<String[]> {

    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * 将参数设置到 PreparedStatement，javaType转jdbcType
     * @param preparedStatement
     * @param columnIndex 参数索引
     * @param parameter 数据
     * @param jdbcType jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int columnIndex, String[] parameter, JdbcType jdbcType) throws SQLException {
        // 将String[]转换为json字符串
        preparedStatement.setString(columnIndex, toJson(parameter));
    }


    @Override
    public String[] getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        // 将json字符串转换为String[]
        return toObject(resultSet.getString(columnName));
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        // 将json字符串转换为String[]
        return toObject(resultSet.getString(columnIndex));
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        // 将json字符串转换为String[]
        return toObject(callableStatement.getString(columnIndex));
    }

    /**
     * String[]转换为Json字符串
     * @param parameter
     * @return
     */
    private String toJson(String[] parameter) {
        try {
            return mapper.writeValueAsString(parameter);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "[]";
    }

    /**
     * 将json字符串转换为String[]
     * @param content
     * @return
     */
    private String[] toObject(String content) {
        if (content != null || !content.isEmpty()) {
            try {
                return mapper.readValue(content, String[].class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
