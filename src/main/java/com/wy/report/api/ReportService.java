package com.wy.report.api;

public interface ReportService {
	
	/**
	 * 日报导出
	 * @return byte[]
	 */
	public byte[] reportExport(String reportType,String reportDate) throws Exception;
}
