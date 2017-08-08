package com.wy.common.model;

/**
 * 分页数据通用返回结果
 * @author TANSHEN
 *
 */
public class PageResult extends GeneralResult {

	private static final long serialVersionUID = 8099834541683409808L;
	
	// 每页条数
	private Integer pageSize = 10;
	// 当前页数
	private Integer currentPage=0;
	// 总页数
	private Integer totalPage=0;
	// 总条数
	private Integer totalNum=0;
	// 上一页
	private Integer pevPage=0;
	// 下一页
	private Integer nextPage=0;
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalPage() {
		totalPage = totalNum / pageSize;
		if (totalNum % pageSize != 0){
			totalPage++;
		}
		return totalPage;
	}
	public Integer getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	public Integer getPevPage() {
		pevPage = currentPage--;
		return pevPage < 0 ? 0 : pevPage;
	}
	public void setPevPage(Integer pevPage) {
		this.pevPage = pevPage;
	}
	public Integer getNextPage() {
		nextPage = currentPage++;
		return nextPage > totalPage ? totalPage : nextPage;
	}
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}
}
