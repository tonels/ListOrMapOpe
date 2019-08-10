package 关键字50个.extendsLs;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象
 *
 * @param <T>
 */
@Data
//@EqualsAndHashCode(callSuper = false)
public class PageBean<T> extends ResultBean {
	
	/**
     * 总的页数
     */
    private Integer totalPage;
    /**
     * 总记录数
     */
    private Long totalCount;
    /**
     * 分页数据
     */
    private List<T> result;

	/**
	 *
	 * @param totalPage 总页数
	 * @param totalCount 总数
	 * @param result
	 */
	public PageBean(Integer totalPage, Long totalCount, List<T> result) {
		super("200","success");
		this.totalPage = totalPage;
		this.totalCount = totalCount;
		this.result = result;
	}


	public PageBean(String code, String msg, Integer totalPage, Long totalCount, List<T> result) {
		super(code, msg);
		this.totalPage = totalPage;
		this.totalCount = totalCount;
		this.result = result;
	}

	public static <T> PageBean<T> ok(Integer totalPage, Long totalCount, List<T> result){
	    return new PageBean<>(totalPage, totalCount, result);
	}

	public static <T> PageBean<T> empty() {
		return new PageBean<>(0, 0L, new ArrayList<>());
	}

	public static PageBean error(){
		return new PageBean("400", "failed with static",0,0L,null);
	}

	public static String erar(){
		return "err";
	}

	public PageBean(String code, String msg, Object result, Integer totalPage) {
		super(code, msg, result);
		this.totalPage = totalPage;
	}

	@Override
	public PageBean err() {
		return this.err();
	}

	public PageBean(String code, String msg) {
		super(code, msg);
	}
}
