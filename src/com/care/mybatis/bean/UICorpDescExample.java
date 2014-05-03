package com.care.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class UICorpDescExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public UICorpDescExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIntroIsNull() {
			addCriterion("intro is null");
			return (Criteria) this;
		}

		public Criteria andIntroIsNotNull() {
			addCriterion("intro is not null");
			return (Criteria) this;
		}

		public Criteria andIntroEqualTo(String value) {
			addCriterion("intro =", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroNotEqualTo(String value) {
			addCriterion("intro <>", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroGreaterThan(String value) {
			addCriterion("intro >", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroGreaterThanOrEqualTo(String value) {
			addCriterion("intro >=", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroLessThan(String value) {
			addCriterion("intro <", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroLessThanOrEqualTo(String value) {
			addCriterion("intro <=", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroLike(String value) {
			addCriterion("intro like", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroNotLike(String value) {
			addCriterion("intro not like", value, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroIn(List<String> values) {
			addCriterion("intro in", values, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroNotIn(List<String> values) {
			addCriterion("intro not in", values, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroBetween(String value1, String value2) {
			addCriterion("intro between", value1, value2, "intro");
			return (Criteria) this;
		}

		public Criteria andIntroNotBetween(String value1, String value2) {
			addCriterion("intro not between", value1, value2, "intro");
			return (Criteria) this;
		}

		public Criteria andBigEventsIsNull() {
			addCriterion("big_events is null");
			return (Criteria) this;
		}

		public Criteria andBigEventsIsNotNull() {
			addCriterion("big_events is not null");
			return (Criteria) this;
		}

		public Criteria andBigEventsEqualTo(String value) {
			addCriterion("big_events =", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsNotEqualTo(String value) {
			addCriterion("big_events <>", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsGreaterThan(String value) {
			addCriterion("big_events >", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsGreaterThanOrEqualTo(String value) {
			addCriterion("big_events >=", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsLessThan(String value) {
			addCriterion("big_events <", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsLessThanOrEqualTo(String value) {
			addCriterion("big_events <=", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsLike(String value) {
			addCriterion("big_events like", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsNotLike(String value) {
			addCriterion("big_events not like", value, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsIn(List<String> values) {
			addCriterion("big_events in", values, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsNotIn(List<String> values) {
			addCriterion("big_events not in", values, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsBetween(String value1, String value2) {
			addCriterion("big_events between", value1, value2, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andBigEventsNotBetween(String value1, String value2) {
			addCriterion("big_events not between", value1, value2, "bigEvents");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysIsNull() {
			addCriterion("leader_says is null");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysIsNotNull() {
			addCriterion("leader_says is not null");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysEqualTo(String value) {
			addCriterion("leader_says =", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysNotEqualTo(String value) {
			addCriterion("leader_says <>", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysGreaterThan(String value) {
			addCriterion("leader_says >", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysGreaterThanOrEqualTo(String value) {
			addCriterion("leader_says >=", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysLessThan(String value) {
			addCriterion("leader_says <", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysLessThanOrEqualTo(String value) {
			addCriterion("leader_says <=", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysLike(String value) {
			addCriterion("leader_says like", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysNotLike(String value) {
			addCriterion("leader_says not like", value, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysIn(List<String> values) {
			addCriterion("leader_says in", values, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysNotIn(List<String> values) {
			addCriterion("leader_says not in", values, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysBetween(String value1, String value2) {
			addCriterion("leader_says between", value1, value2, "leaderSays");
			return (Criteria) this;
		}

		public Criteria andLeaderSaysNotBetween(String value1, String value2) {
			addCriterion("leader_says not between", value1, value2, "leaderSays");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table ui_corp_desc
	 * @mbggenerated  Sat May 03 15:51:52 CST 2014
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ui_corp_desc
     *
     * @mbggenerated do_not_delete_during_merge Mon Apr 28 22:53:35 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}