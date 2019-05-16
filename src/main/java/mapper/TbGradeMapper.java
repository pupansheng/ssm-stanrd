package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbGrade;
import pojo.TbGradeExample;

public interface TbGradeMapper {
    int countByExample(TbGradeExample example);

    int deleteByExample(TbGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGrade record);

    int insertSelective(TbGrade record);

    List<TbGrade> selectByExample(TbGradeExample example);

    TbGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGrade record, @Param("example") TbGradeExample example);

    int updateByExample(@Param("record") TbGrade record, @Param("example") TbGradeExample example);

    int updateByPrimaryKeySelective(TbGrade record);

    int updateByPrimaryKey(TbGrade record);
}