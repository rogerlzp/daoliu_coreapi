package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.FeedBackResult;
import com.wy.user.dto.FeedbackEnter;

public interface FeedBackService {
	
	@Role
	FeedBackResult saveFeedBack(FeedbackEnter feedbackEnter);
}
