package com.kitri.project.member.dao;

import java.util.HashMap;
import java.util.Map;

import com.kitri.project.member.Member;

public interface IMemberDao {

	Member memberSelect(Member member);
	int memberInsert(Member member);
	int memberUpdate(Member member);
	int memberDelete(Member member);
	
}
