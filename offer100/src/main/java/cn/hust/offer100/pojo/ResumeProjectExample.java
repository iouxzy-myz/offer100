package cn.hust.offer100.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResumeProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityIsNull() {
            addCriterion("project_responsibility is null");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityIsNotNull() {
            addCriterion("project_responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityEqualTo(String value) {
            addCriterion("project_responsibility =", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityNotEqualTo(String value) {
            addCriterion("project_responsibility <>", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityGreaterThan(String value) {
            addCriterion("project_responsibility >", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("project_responsibility >=", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityLessThan(String value) {
            addCriterion("project_responsibility <", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("project_responsibility <=", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityLike(String value) {
            addCriterion("project_responsibility like", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityNotLike(String value) {
            addCriterion("project_responsibility not like", value, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityIn(List<String> values) {
            addCriterion("project_responsibility in", values, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityNotIn(List<String> values) {
            addCriterion("project_responsibility not in", values, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityBetween(String value1, String value2) {
            addCriterion("project_responsibility between", value1, value2, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectResponsibilityNotBetween(String value1, String value2) {
            addCriterion("project_responsibility not between", value1, value2, "projectResponsibility");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeIsNull() {
            addCriterion("project_starttime is null");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeIsNotNull() {
            addCriterion("project_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeEqualTo(Date value) {
            addCriterion("project_starttime =", value, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeNotEqualTo(Date value) {
            addCriterion("project_starttime <>", value, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeGreaterThan(Date value) {
            addCriterion("project_starttime >", value, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_starttime >=", value, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeLessThan(Date value) {
            addCriterion("project_starttime <", value, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("project_starttime <=", value, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeIn(List<Date> values) {
            addCriterion("project_starttime in", values, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeNotIn(List<Date> values) {
            addCriterion("project_starttime not in", values, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeBetween(Date value1, Date value2) {
            addCriterion("project_starttime between", value1, value2, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("project_starttime not between", value1, value2, "projectStarttime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeIsNull() {
            addCriterion("project_endtime is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeIsNotNull() {
            addCriterion("project_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeEqualTo(Date value) {
            addCriterion("project_endtime =", value, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeNotEqualTo(Date value) {
            addCriterion("project_endtime <>", value, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeGreaterThan(Date value) {
            addCriterion("project_endtime >", value, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_endtime >=", value, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeLessThan(Date value) {
            addCriterion("project_endtime <", value, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("project_endtime <=", value, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeIn(List<Date> values) {
            addCriterion("project_endtime in", values, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeNotIn(List<Date> values) {
            addCriterion("project_endtime not in", values, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeBetween(Date value1, Date value2) {
            addCriterion("project_endtime between", value1, value2, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("project_endtime not between", value1, value2, "projectEndtime");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsIsNull() {
            addCriterion("project_details is null");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsIsNotNull() {
            addCriterion("project_details is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsEqualTo(String value) {
            addCriterion("project_details =", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsNotEqualTo(String value) {
            addCriterion("project_details <>", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsGreaterThan(String value) {
            addCriterion("project_details >", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("project_details >=", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsLessThan(String value) {
            addCriterion("project_details <", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsLessThanOrEqualTo(String value) {
            addCriterion("project_details <=", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsLike(String value) {
            addCriterion("project_details like", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsNotLike(String value) {
            addCriterion("project_details not like", value, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsIn(List<String> values) {
            addCriterion("project_details in", values, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsNotIn(List<String> values) {
            addCriterion("project_details not in", values, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsBetween(String value1, String value2) {
            addCriterion("project_details between", value1, value2, "projectDetails");
            return (Criteria) this;
        }

        public Criteria andProjectDetailsNotBetween(String value1, String value2) {
            addCriterion("project_details not between", value1, value2, "projectDetails");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}