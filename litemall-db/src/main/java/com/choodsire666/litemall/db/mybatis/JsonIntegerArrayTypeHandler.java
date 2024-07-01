package com.choodsire666.litemall.db.mybatis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 谢金成
 * @date 2024/7/1 23:13
 */
public class JsonIntegerArrayTypeHandler extends BaseTypeHandler<Integer[]> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int columnIndex, Integer[] parameters, JdbcType jdbcType) throws SQLException {
        // 将Integer[]转换为Json字符串
        preparedStatement.setString(columnIndex, toJson(parameters));
    }

    @Override
    public Integer[] getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return toObject(resultSet.getString(columnName));
    }

    @Override
    public Integer[] getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return toObject(resultSet.getString(columnIndex));
    }

    @Override
    public Integer[] getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return toObject(callableStatement.getString(columnIndex));
    }

    /**
     * 将Integer[]转换为Json字符串
     * @param parameters
     * @return
     */
    private String toJson(Integer[] parameters) {
        try {
            return mapper.writeValueAsString(parameters);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "[]";
    }

    /**
     * 将Json字符串转换为Integer[]
     * @param content
     * @return
     */
    private Integer[] toObject(String content) {
        if (content != null && !content.isEmpty()) {
            try {
                return mapper.readValue(content, Integer[].class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
