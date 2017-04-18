package xframe.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import xframe.springboot.po.Author;

public interface AuthorMapper {
	
	@Insert("insert into t_author(real_name, nick_name) values(#{realName}, #{nickName})")
    int add(@Param("realName") String realName, @Param("nickName") String nickName);
 
    @Update("update t_author set real_name = #{real_name}, nick_name = #{nick_name} where id = #{id}")
    int update(@Param("real_name") String realName, @Param("nick_name") String nickName, @Param("id") Long id);
 
    @Delete("delete from t_author where id = #{id}")
    int delete(Long id);
 
    @Select("select id, real_name as realName, nick_name as nickName from t_author where id = #{id}")
    Author findAuthor(@Param("id") Long id);
 
    @Select("select id, real_name as realName, nick_name as nickName from t_author")
    List<Author> findAuthorList();
}
