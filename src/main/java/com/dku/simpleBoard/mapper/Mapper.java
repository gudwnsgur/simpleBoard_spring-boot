package com.dku.simpleBoard.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Mapper {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSessionTemplate sqlSession;
    private final static String NAMESPACE = "com.dku.simpleBoard.mapper.Mapper.";

    public List rawDataSelectList() throws Exception{
        return sqlSession.selectList(NAMESPACE + "rawDataSelectList");
    }
    // public void rawDataInsertVO()
}
