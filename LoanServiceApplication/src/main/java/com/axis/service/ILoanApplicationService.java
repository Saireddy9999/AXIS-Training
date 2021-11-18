package com.axis.service;

import com.axis.entity.LoanApplication;

public interface ILoanApplicationService {

	public LoanApplication save(LoanApplication loanApp);
	public LoanApplication view(Integer loanId);
	public LoanApplication approve(Integer loanId);
	public LoanApplication reject(Integer loanId);

}
