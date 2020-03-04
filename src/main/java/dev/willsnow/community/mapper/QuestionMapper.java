package dev.willsnow.community.mapper;

import dev.willsnow.community.dto.QuestionDTO;
import dev.willsnow.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author will
 */

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title, description, gmt_create, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    void create(Question question);

    @Select("select * from question limit #{size} offset #{offset}")
    List<Question> list(@Param("size") Integer size, @Param("offset") Integer offset);

    @Select("select count(1) from question")
    Integer count();

    @Select("select * from question where creator=#{userId} limit #{size} offset #{offset}")
    List<Question> listByUserId(@Param("userId") Integer userId, @Param("size") Integer size, @Param("offset") Integer offset);

    @Select("select count(1) from question where creator=#{userId}")
    Integer countByUserId(@Param("userId") Integer userId);

    @Select("select * from question where id=#{id}")
    Question getById(@Param("id") Integer id);
}
