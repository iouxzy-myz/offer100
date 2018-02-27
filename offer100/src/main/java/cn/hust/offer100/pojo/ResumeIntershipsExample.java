package cn.hust.offer100.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResumeIntershipsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeIntershipsExample() {
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

        public Criteria andIntershipEnterpriseIsNull() {
            addCriterion("intership_enterprise is null");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseIsNotNull() {
            addCriterion("intership_enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseEqualTo(String value) {
            addCriterion("intership_enterprise =", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseNotEqualTo(String value) {
            addCriterion("intership_enterprise <>", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseGreaterThan(String value) {
            addCriterion("intership_enterprise >", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("intership_enterprise >=", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseLessThan(String value) {
            addCriterion("intership_enterprise <", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("intership_enterprise <=", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseLike(String value) {
            addCriterion("intership_enterprise like", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseNotLike(String value) {
            addCriterion("intership_enterprise not like", value, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseIn(List<String> values) {
            addCriterion("intership_enterprise in", values, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseNotIn(List<String> values) {
            addCriterion("intership_enterprise not in", values, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseBetween(String value1, String value2) {
            addCriterion("intership_enterprise between", value1, value2, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershipEnterpriseNotBetween(String value1, String value2) {
            addCriterion("intership_enterprise not between", value1, value2, "intershipEnterprise");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionIsNull() {
            addCriterion("intershi_position is null");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionIsNotNull() {
            addCriterion("intershi_position is not null");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionEqualTo(String value) {
            addCriterion("intershi_position =", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionNotEqualTo(String value) {
            addCriterion("intershi_position <>", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionGreaterThan(String value) {
            addCriterion("intershi_position >", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionGreaterThanOrEqualTo(String value) {
            addCriterion("intershi_position >=", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionLessThan(String value) {
            addCriterion("intershi_position <", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionLessThanOrEqualTo(String value) {
            addCriterion("intershi_position <=", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionLike(String value) {
            addCriterion("intershi_position like", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionNotLike(String value) {
            addCriterion("intershi_position not like", value, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionIn(List<String> values) {
            addCriterion("intershi_position in", values, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionNotIn(List<String> values) {
            addCriterion("intershi_position not in", values, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionBetween(String value1, String value2) {
            addCriterion("intershi_position between", value1, value2, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershiPositionNotBetween(String value1, String value2) {
            addCriterion("intershi_position not between", value1, value2, "intershiPosition");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateIsNull() {
            addCriterion("intership_startdate is null");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateIsNotNull() {
            addCriterion("intership_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateEqualTo(Date value) {
            addCriterion("intership_startdate =", value, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateNotEqualTo(Date value) {
            addCriterion("intership_startdate <>", value, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateGreaterThan(Date value) {
            addCriterion("intership_startdate >", value, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("intership_startdate >=", value, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateLessThan(Date value) {
            addCriterion("intership_startdate <", value, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateLessThanOrEqualTo(Date value) {
            addCriterion("intership_startdate <=", value, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateIn(List<Date> values) {
            addCriterion("intership_startdate in", values, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateNotIn(List<Date> values) {
            addCriterion("intership_startdate not in", values, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateBetween(Date value1, Date value2) {
            addCriterion("intership_startdate between", value1, value2, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipStartdateNotBetween(Date value1, Date value2) {
            addCriterion("intership_startdate not between", value1, value2, "intershipStartdate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateIsNull() {
            addCriterion("intership_enddate is null");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateIsNotNull() {
            addCriterion("intership_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateEqualTo(Date value) {
            addCriterion("intership_enddate =", value, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateNotEqualTo(Date value) {
            addCriterion("intership_enddate <>", value, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateGreaterThan(Date value) {
            addCriterion("intership_enddate >", value, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("intership_enddate >=", value, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateLessThan(Date value) {
            addCriterion("intership_enddate <", value, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateLessThanOrEqualTo(Date value) {
            addCriterion("intership_enddate <=", value, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateIn(List<Date> values) {
            addCriterion("intership_enddate in", values, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateNotIn(List<Date> values) {
            addCriterion("intership_enddate not in", values, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateBetween(Date value1, Date value2) {
            addCriterion("intership_enddate between", value1, value2, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipEnddateNotBetween(Date value1, Date value2) {
            addCriterion("intership_enddate not between", value1, value2, "intershipEnddate");
            return (Criteria) this;
        }

        public Criteria andIntershipContentIsNull() {
            addCriterion("intership_content is null");
            return (Criteria) this;
        }

        public Criteria andIntershipContentIsNotNull() {
            addCriterion("intership_content is not null");
            return (Criteria) this;
        }

        public Criteria andIntershipContentEqualTo(String value) {
            addCriterion("intership_content =", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentNotEqualTo(String value) {
            addCriterion("intership_content <>", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentGreaterThan(String value) {
            addCriterion("intership_content >", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentGreaterThanOrEqualTo(String value) {
            addCriterion("intership_content >=", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentLessThan(String value) {
            addCriterion("intership_content <", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentLessThanOrEqualTo(String value) {
            addCriterion("intership_content <=", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentLike(String value) {
            addCriterion("intership_content like", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentNotLike(String value) {
            addCriterion("intership_content not like", value, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentIn(List<String> values) {
            addCriterion("intership_content in", values, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentNotIn(List<String> values) {
            addCriterion("intership_content not in", values, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentBetween(String value1, String value2) {
            addCriterion("intership_content between", value1, value2, "intershipContent");
            return (Criteria) this;
        }

        public Criteria andIntershipContentNotBetween(String value1, String value2) {
            addCriterion("intership_content not between", value1, value2, "intershipContent");
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