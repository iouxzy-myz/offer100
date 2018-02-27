package cn.hust.offer100.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResumeEducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeEducationExample() {
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

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorIsNull() {
            addCriterion("school_major is null");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorIsNotNull() {
            addCriterion("school_major is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorEqualTo(String value) {
            addCriterion("school_major =", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorNotEqualTo(String value) {
            addCriterion("school_major <>", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorGreaterThan(String value) {
            addCriterion("school_major >", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorGreaterThanOrEqualTo(String value) {
            addCriterion("school_major >=", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorLessThan(String value) {
            addCriterion("school_major <", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorLessThanOrEqualTo(String value) {
            addCriterion("school_major <=", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorLike(String value) {
            addCriterion("school_major like", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorNotLike(String value) {
            addCriterion("school_major not like", value, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorIn(List<String> values) {
            addCriterion("school_major in", values, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorNotIn(List<String> values) {
            addCriterion("school_major not in", values, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorBetween(String value1, String value2) {
            addCriterion("school_major between", value1, value2, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolMajorNotBetween(String value1, String value2) {
            addCriterion("school_major not between", value1, value2, "schoolMajor");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundIsNull() {
            addCriterion("school_background is null");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundIsNotNull() {
            addCriterion("school_background is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundEqualTo(String value) {
            addCriterion("school_background =", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundNotEqualTo(String value) {
            addCriterion("school_background <>", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundGreaterThan(String value) {
            addCriterion("school_background >", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("school_background >=", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundLessThan(String value) {
            addCriterion("school_background <", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundLessThanOrEqualTo(String value) {
            addCriterion("school_background <=", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundLike(String value) {
            addCriterion("school_background like", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundNotLike(String value) {
            addCriterion("school_background not like", value, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundIn(List<String> values) {
            addCriterion("school_background in", values, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundNotIn(List<String> values) {
            addCriterion("school_background not in", values, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundBetween(String value1, String value2) {
            addCriterion("school_background between", value1, value2, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andSchoolBackgroundNotBetween(String value1, String value2) {
            addCriterion("school_background not between", value1, value2, "schoolBackground");
            return (Criteria) this;
        }

        public Criteria andGraduationYearIsNull() {
            addCriterion("graduation_year is null");
            return (Criteria) this;
        }

        public Criteria andGraduationYearIsNotNull() {
            addCriterion("graduation_year is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationYearEqualTo(Date value) {
            addCriterion("graduation_year =", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearNotEqualTo(Date value) {
            addCriterion("graduation_year <>", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearGreaterThan(Date value) {
            addCriterion("graduation_year >", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearGreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_year >=", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearLessThan(Date value) {
            addCriterion("graduation_year <", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearLessThanOrEqualTo(Date value) {
            addCriterion("graduation_year <=", value, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearIn(List<Date> values) {
            addCriterion("graduation_year in", values, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearNotIn(List<Date> values) {
            addCriterion("graduation_year not in", values, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearBetween(Date value1, Date value2) {
            addCriterion("graduation_year between", value1, value2, "graduationYear");
            return (Criteria) this;
        }

        public Criteria andGraduationYearNotBetween(Date value1, Date value2) {
            addCriterion("graduation_year not between", value1, value2, "graduationYear");
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