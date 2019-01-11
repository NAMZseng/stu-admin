package models;

import java.math.BigDecimal;

import javax.persistence.Entity;

import org.codehaus.groovy.runtime.dgmimpl.arrays.FloatArrayGetAtMetaMethod;

import jdk.nashorn.internal.ir.annotations.Reference;
import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class CollegeStudent extends Model {

	//用于判断构造器中if语句的执行路径
	public static int flg = 1;

	@MaxSize(16)
	public String name;
	@Required
	// crud的search.xml仅接受String类型
	//为自定义按学号查询，需要将学号设为String
	public String studentId;
	@Required
	public BigDecimal tuitionFee;
	@Required
	public int courseNum; // 选课数
	@Required
	public BigDecimal averageSore; // 平均分

	public CollegeStudent() {
		super();
		// 当系统一次初始化时，还未建立好CollegeStudent实体，直接执行else语句会报错
		// 所以需要设置一个初始值为1的flg
		//在未初始化前执行if语句体，初始化创建实体后，再执行else体
		if (flg == 1) {
			flg--;
		} else {
			long nextId = CollegeStudent.count() + 10001;
			this.studentId = String.valueOf(nextId);
		}
	}

	@Override
	public String toString() {
		return name;
	}

}
