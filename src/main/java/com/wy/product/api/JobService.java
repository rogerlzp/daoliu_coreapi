package com.wy.product.api;

import com.wy.product.dto.JobEnter;
import com.wy.product.dto.JobResult;
import com.wy.product.dto.OrderEnter;

/**
 * Created by liuyw on 2016/1/5.
 */
public interface JobService {

    JobResult startJob(JobEnter jobEnter);
}
