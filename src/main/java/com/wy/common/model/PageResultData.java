package com.wy.common.model;

public class PageResultData extends ResultData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7836291168577200434L;

	private long current_page_no;

	private long page_size;

	private long total_count;

	public PageResultData() {
		super();
	}

	public PageResultData(String resultCode, String resultMessage) {
		super(resultCode, resultMessage);
	}

	public PageResultData(String resultCode) {
		super(resultCode);
	}

	public PageResultData(String resultCode, String resultMessage, Object data) {
		super(resultCode, resultMessage, data);
	}

	public PageResultData(String resultCode, Object data) {
		super(resultCode, data);
	}

	public PageResultData(String resultCode, Object data, long current_page_no, long page_size, long total_count) {
		super(resultCode, data);
		this.current_page_no = current_page_no;
		this.page_size = page_size;
		this.total_count = total_count;
	}

	public PageResultData(Object data, long current_page_no, long page_size, long total_count) {
		super(data);
		this.current_page_no = current_page_no;
		this.page_size = page_size;
		this.total_count = total_count;
	}

	public PageResultData(long current_page_no, long page_size, long total_count) {
		this.current_page_no = current_page_no;
		this.page_size = page_size;
		this.total_count = total_count;
	}

	public long getCurrent_page_no() {
		return current_page_no;
	}

	public void setCurrent_page_no(long current_page_no) {
		this.current_page_no = current_page_no;
	}

	public long getPage_size() {
		return this.page_size <= 0 ? 10 : this.page_size;
	}

	public long getTotal_page() {
		long totalPage = this.total_count / this.getPage_size();
		if (this.total_count % this.getPage_size() == 0) {
			return totalPage;
		} else {
			return totalPage + 1;
		}
	}

	public long getTotal_count() {
		return total_count;
	}

	public void setTotal_count(long total_count) {
		this.total_count = total_count;
	}

	public long getNext_page_no() {
		if (getTotal_page() - 1 == getCurrent_page_no()) {
			return -1;
		} else {
			return getCurrent_page_no() + 1;
		}
	}

	public long getPrevious_page_no() {
		return getCurrent_page_no() - 1;
	}

}
