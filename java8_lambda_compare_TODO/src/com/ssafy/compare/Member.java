package com.ssafy.compare;

// TODO:정렬 객체 설계
public class Member implements Comparable<Member>{
	private String memberId;
	private String memberPw;
	private String name;
	private String mobile;
	private String email;
	
	public Member() {}

	/**
	 * @param memberId
	 * @param memberPw
	 * @param name
	 * @param mobile
	 * @param email
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(memberId);
		builder.append("| ");
		builder.append(String.format("%-10s", memberPw));
		builder.append("| ");
		builder.append(name);
		builder.append("| ");
		builder.append(mobile);
		builder.append("| ");
		builder.append(email);
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		// 1. 아이디 기준 올림차순 정렬 : String memberId => compareTo()
		// this 객체가 앞에 위치하면 올림차순. 뒤에 위치하면 내림차순.
//		return this.memberId.compareTo(o.getMemberId()); //올림차순
		//return o.getMemberId().compareTo(this.memberId); //내림차순
		// 2. 아이디 기준 내림차순 정렬
		// 3. 이름 기준 올림차순 정렬, 이름이 같으면 아이디 올림차순 정렬
		if(this.name.compareTo(o.getName()) == 0) {
			return this.memberId.compareTo(o.getMemberId());
		}
		return this.name.compareTo(o.getName());
		
	}


}
