package com.achilles.record.enums;

import com.achilles.record.constant.ClzConstant;

import java.util.*;

public enum ModelFunctionEnum {

    //--------------------------------------------- mission  start ----------------------------------------------------------------
    MISSION_ADD(ClzConstant.MISSION_COMMAND + ".add", ModelEnum.MISSION.getKey(),"add", ModelEnum.MISSION.getValue() + "_新增"),
    MISSION_DEL(ClzConstant.MISSION_COMMAND + ".delete", ModelEnum.MISSION.getKey(),"delete", ModelEnum.MISSION.getValue() + "_删除"),
    MISSION_UPDATE(ClzConstant.MISSION_COMMAND + ".update", ModelEnum.MISSION.getKey(),"update", ModelEnum.MISSION.getValue() + "_修改"),
    MISSION_UPDATE_INITIAL(ClzConstant.MISSION_COMMAND + ".updateInitial", ModelEnum.MISSION.getKey(),"updateInitial", ModelEnum.MISSION.getValue() + "_改为未处理"),
    MISSION_UPDATE_DOING(ClzConstant.MISSION_COMMAND + ".updateDoing", ModelEnum.MISSION.getKey(),"updateDoing", ModelEnum.MISSION.getValue() + "_改为处理中"),
    MISSION_UPDATE_DONE(ClzConstant.MISSION_COMMAND + ".updateDone", ModelEnum.MISSION.getKey(),"updateDone", ModelEnum.MISSION.getValue() + "_改为已完成"),
    MISSION_UPDATE_CONTENT(ClzConstant.MISSION_COMMAND + ".updateContent", ModelEnum.MISSION.getKey(),"updateContent", ModelEnum.MISSION.getValue() + "_修改正文"),

    MISSION_DOWNLOAD(ClzConstant.MISSION_QUERY + ".download", ModelEnum.MISSION.getKey(),"download", ModelEnum.MISSION.getValue() + "_下载"),
    MISSION_GET(ClzConstant.MISSION_QUERY + ".get", ModelEnum.MISSION.getKey(),"get", ModelEnum.MISSION.getValue() + "_根据id查询"),
    MISSION_GET_CONTENT(ClzConstant.MISSION_QUERY + ".getContentById", ModelEnum.MISSION.getKey(),"getContentById", ModelEnum.MISSION.getValue() + "_根据id查询内容"),
    MISSION_LIST(ClzConstant.MISSION_QUERY + ".getPageList", ModelEnum.MISSION.getKey(),"getPageList", ModelEnum.MISSION.getValue() + "_查询列表"),
    MISSION_COUNT(ClzConstant.MISSION_QUERY + ".getCount", ModelEnum.MISSION.getKey(),"getCount", ModelEnum.MISSION.getValue() + "_查询总数"),
    MISSION_TYPE(ClzConstant.MISSION_QUERY + ".getType", ModelEnum.MISSION.getKey(),"getType", ModelEnum.MISSION.getValue() + "_查询所有类型"),
    MISSION_PACE(ClzConstant.MISSION_QUERY + ".getPace", ModelEnum.MISSION.getKey(),"getPace", ModelEnum.MISSION.getValue() + "_查询所有进度"),
    MISSION_GET_IMG(ClzConstant.MISSION_QUERY + ".getBigImg", ModelEnum.MISSION.getKey(),"getBigImg", ModelEnum.MISSION.getValue() + "_获取大图"),
    MISSION_GET_LAST_DOWNLOAD_COUNT(ClzConstant.MISSION_QUERY + ".getLastDownloadCount", ModelEnum.MISSION.getKey(),"getLastDownloadCount", ModelEnum.MISSION.getValue() + "_获取可导出excel次数"),
    MISSION_GET_BY_ID_AND_CONDITION(ClzConstant.MISSION_QUERY + ".getByIdAndCondition", ModelEnum.MISSION.getKey(),"getByIdAndCondition", ModelEnum.MISSION.getValue() + "_根据id和其它条件查询"),


    //--------------------------------------------- note  start ----------------------------------------------------------------
    NOTE_ADD(ClzConstant.NOTE_COMMAND + ".add", ModelEnum.NOTE.getKey(),"add", ModelEnum.NOTE.getValue() + "_新增"),
    NOTE_DEL(ClzConstant.NOTE_COMMAND + ".delete", ModelEnum.NOTE.getKey(),"delete", ModelEnum.NOTE.getValue() + "_删除"),
    NOTE_UPDATE(ClzConstant.NOTE_COMMAND + ".update", ModelEnum.NOTE.getKey(),"update", ModelEnum.NOTE.getValue() + "_修改"),
    NOTE_UPDATE_CONTENT(ClzConstant.NOTE_COMMAND + ".updateContent", ModelEnum.NOTE.getKey(),"updateContent", ModelEnum.NOTE.getValue() + "_修改正文"),
    NOTE_DELETE_RECYCLE(ClzConstant.NOTE_COMMAND + ".deleteRecycle", ModelEnum.NOTE.getKey(),"deleteRecycle", ModelEnum.NOTE.getValue() + "_删除回收站的一个"),
    NOTE_CLEAN_RECYCLE(ClzConstant.NOTE_COMMAND + ".cleanRecycle", ModelEnum.NOTE.getKey(),"cleanRecycle", ModelEnum.NOTE.getValue() + "_清空回收站"),
    NOTE_RECYCLE(ClzConstant.NOTE_COMMAND + ".recycle", ModelEnum.NOTE.getKey(),"recycle", ModelEnum.NOTE.getValue() + "还原一个"),

    NOTE_DOWNLOAD(ClzConstant.NOTE_QUERY + ".download", ModelEnum.NOTE.getKey(),"download", ModelEnum.NOTE.getValue() + "_下载"),
    NOTE_GET(ClzConstant.NOTE_QUERY + ".get", ModelEnum.NOTE.getKey(),"get", ModelEnum.NOTE.getValue() + "_根据id查询"),
    NOTE_GET_CONTENT(ClzConstant.NOTE_QUERY + ".getContentById", ModelEnum.NOTE.getKey(),"getContentById", ModelEnum.NOTE.getValue() + "_根据id查询内容"),
    NOTE_LIST(ClzConstant.NOTE_QUERY + ".getPageList", ModelEnum.NOTE.getKey(),"getPageList", ModelEnum.NOTE.getValue() + "_查询列表"),
    NOTE_RECYCLE_LIST(ClzConstant.NOTE_QUERY + ".getRecyclePageList", ModelEnum.NOTE.getKey(),"getRecyclePageList", ModelEnum.NOTE.getValue() + "_查询回收站列表"),
    NOTE_COUNT(ClzConstant.NOTE_QUERY + ".getCount", ModelEnum.NOTE.getKey(),"getCount", ModelEnum.NOTE.getValue() + "_查询总数"),
    NOTE_TYPE(ClzConstant.NOTE_QUERY + ".getType", ModelEnum.NOTE.getKey(),"getType", ModelEnum.NOTE.getValue() + "_查询所有类型"),
    NOTE_GET_IMG(ClzConstant.NOTE_QUERY + ".getBigImg", ModelEnum.NOTE.getKey(),"getBigImg", ModelEnum.NOTE.getValue() + "_获取大图"),
    NOTE_GET_LAST_DOWNLOAD_COUNT(ClzConstant.NOTE_QUERY + ".getLastDownloadCount", ModelEnum.NOTE.getKey(),"getLastDownloadCount", ModelEnum.NOTE.getValue() + "_获取可导出excel次数"),
    NOTE_GET_BY_ID_AND_CONDITION(ClzConstant.NOTE_QUERY + ".getByIdAndCondition", ModelEnum.NOTE.getKey(),"getByIdAndCondition", ModelEnum.NOTE.getValue() + "_根据id和其它条件查询"),


    //--------------------------------------------- notes  start ----------------------------------------------------------------
    NOTES_ADD(ClzConstant.NOTES_COMMAND + ".add", ModelEnum.NOTES.getKey(),"add", ModelEnum.NOTES.getValue() + "_新增"),
    NOTES_DEL(ClzConstant.NOTES_COMMAND + ".delete", ModelEnum.NOTES.getKey(),"delete", ModelEnum.NOTES.getValue() + "_删除"),
    NOTES_UPDATE(ClzConstant.NOTES_COMMAND + ".update", ModelEnum.NOTES.getKey(),"update", ModelEnum.NOTES.getValue() + "_修改"),
    NOTES_UPDATE_CONTENT(ClzConstant.NOTES_COMMAND + ".updateContent", ModelEnum.NOTES.getKey(),"updateContent", ModelEnum.NOTES.getValue() + "_修改正文"),
    NOTES_DELETE_RECYCLE(ClzConstant.NOTES_COMMAND + ".deleteRecycle", ModelEnum.NOTES.getKey(),"deleteRecycle", ModelEnum.NOTES.getValue() + "_删除回收站的一个"),
    NOTES_CLEAN_RECYCLE(ClzConstant.NOTES_COMMAND + ".cleanRecycle", ModelEnum.NOTES.getKey(),"cleanRecycle", ModelEnum.NOTES.getValue() + "_清空回收站"),
    NOTES_RECYCLE(ClzConstant.NOTES_COMMAND + ".recycle", ModelEnum.NOTES.getKey(),"recycle", ModelEnum.NOTES.getValue() + "还原一个"),

    NOTES_DOWNLOAD(ClzConstant.NOTES_QUERY + ".download", ModelEnum.NOTES.getKey(),"download", ModelEnum.NOTES.getValue() + "_下载"),
    NOTES_GET(ClzConstant.NOTES_QUERY + ".get", ModelEnum.NOTES.getKey(),"get", ModelEnum.NOTES.getValue() + "_根据id查询"),
    NOTES_GET_CONTENT(ClzConstant.NOTES_QUERY + ".getContentById", ModelEnum.NOTES.getKey(),"getContentById", ModelEnum.NOTES.getValue() + "_根据id查询内容"),
    NOTES_LIST(ClzConstant.NOTES_QUERY + ".getPageList", ModelEnum.NOTES.getKey(),"getPageList", ModelEnum.NOTES.getValue() + "_查询列表"),
    NOTES_RECYCLE_LIST(ClzConstant.NOTES_QUERY + ".getRecyclePageList", ModelEnum.NOTES.getKey(),"getRecyclePageList", ModelEnum.NOTES.getValue() + "_查询回收站列表"),
    NOTES_COUNT(ClzConstant.NOTES_QUERY + ".getCount", ModelEnum.NOTES.getKey(),"getCount", ModelEnum.NOTES.getValue() + "_查询总数"),
    NOTES_TYPE(ClzConstant.NOTES_QUERY + ".getType", ModelEnum.NOTES.getKey(),"getType", ModelEnum.NOTES.getValue() + "_查询所有类型"),
    NOTES_GET_IMG(ClzConstant.NOTES_QUERY + ".getBigImg", ModelEnum.NOTES.getKey(),"getBigImg", ModelEnum.NOTES.getValue() + "_获取大图"),
    NOTES_GET_LAST_DOWNLOAD_COUNT(ClzConstant.NOTES_QUERY + ".getLastDownloadCount", ModelEnum.NOTES.getKey(),"getLastDownloadCount", ModelEnum.NOTES.getValue() + "_获取可导出excel次数"),
    NOTES_GET_BY_ID_AND_CONDITION(ClzConstant.NOTES_QUERY + ".getByIdAndCondition", ModelEnum.NOTES.getKey(),"getByIdAndCondition", ModelEnum.NOTES.getValue() + "_根据id和其它条件查询"),


    //--------------------------------------------- finance  start ----------------------------------------------------------------
    FINANCE_ADD(ClzConstant.FINANCE_COMMAND + ".add", ModelEnum.FINANCE.getKey(),"add", ModelEnum.FINANCE.getValue() + "_新增"),
    FINANCE_DEL(ClzConstant.FINANCE_COMMAND + ".delete", ModelEnum.FINANCE.getKey(),"delete", ModelEnum.FINANCE.getValue() + "_删除"),
    FINANCE_UPDATE(ClzConstant.FINANCE_COMMAND + ".update", ModelEnum.FINANCE.getKey(),"update", ModelEnum.FINANCE.getValue() + "_修改"),
    FINANCE_DEL_RECYCLE(ClzConstant.FINANCE_COMMAND + ".deleteRecycle", ModelEnum.FINANCE.getKey(),"deleteRecycle", ModelEnum.FINANCE.getValue() + "_删除回收站"),
    FINANCE_RECYCLE(ClzConstant.FINANCE_COMMAND + ".recycle", ModelEnum.FINANCE.getKey(),"recycle", ModelEnum.FINANCE.getValue() + "_还原回收站"),

    FINANCE_DOWNLOAD(ClzConstant.FINANCE_QUERY + ".download", ModelEnum.FINANCE.getKey(),"download", ModelEnum.FINANCE.getValue() + "_下载"),
    FINANCE_GET(ClzConstant.FINANCE_QUERY + ".get", ModelEnum.FINANCE.getKey(),"get", ModelEnum.FINANCE.getValue() + "_根据id查询"),
    FINANCE_LIST(ClzConstant.FINANCE_QUERY + ".getPageList", ModelEnum.FINANCE.getKey(),"getPageList", ModelEnum.FINANCE.getValue() + "_查询列表"),
    FINANCE_COUNT(ClzConstant.FINANCE_QUERY + ".getCount", ModelEnum.FINANCE.getKey(),"getCount", ModelEnum.FINANCE.getValue() + "_查询总数"),
    FINANCE_GET_SUM(ClzConstant.FINANCE_QUERY + ".getSum", ModelEnum.FINANCE.getKey(),"getSum", ModelEnum.FINANCE.getValue() + "_查询汇总"),
    FINANCE_GET_IMG(ClzConstant.FINANCE_QUERY + ".getBigImg", ModelEnum.FINANCE.getKey(),"getBigImg", ModelEnum.FINANCE.getValue() + "_获取大图"),
    FINANCE_GET_LAST_DOWNLOAD_COUNT(ClzConstant.FINANCE_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE.getKey(),"getLastDownloadCount", ModelEnum.FINANCE.getValue() + "_获取可导出excel次数"),
    FINANCE_GET_BY_ID_AND_CONDITION(ClzConstant.FINANCE_QUERY + ".getByIdAndCondition", ModelEnum.FINANCE.getKey(),"getByIdAndCondition", ModelEnum.FINANCE.getValue() + "_根据id和其它条件查询"),

    FINANCE_DATE_CLASSIFIED(ClzConstant.FINANCE_DATE_QUERY + ".getClassified", ModelEnum.FINANCE_DATE.getKey(),"getClassified", ModelEnum.FINANCE_DATE.getValue() + "_根据条件查询分类汇总"),
    FINANCE_DATE_CLASSIFIED_DATE(ClzConstant.FINANCE_DATE_QUERY + ".getClassifiedDate", ModelEnum.FINANCE_DATE.getKey(),"getClassifiedDate", ModelEnum.FINANCE_DATE.getValue() + "_根据日期查询分类汇总"),
    FINANCE_DATE_LIST(ClzConstant.FINANCE_DATE_QUERY + ".getPageList", ModelEnum.FINANCE_DATE.getKey(),"getPageList", ModelEnum.FINANCE_DATE.getValue() + "_查询列表"),
    FINANCE_DATE_LIST_DETAIL(ClzConstant.FINANCE_DATE_QUERY + ".getPageListDetail", ModelEnum.FINANCE_DATE.getKey(),"getPageListDetail", ModelEnum.FINANCE_DATE.getValue() + "_查询列表及详细"),
    FINANCE_DATE_GET(ClzConstant.FINANCE_DATE_QUERY + ".getByDate", ModelEnum.FINANCE_DATE.getKey(),"getByDate", ModelEnum.FINANCE_DATE.getValue() + "_根据天获取"),
    FINANCE_DATE_GET_SUM(ClzConstant.FINANCE_DATE_QUERY + ".getSumAmount", ModelEnum.FINANCE_DATE.getKey(),"getSumAmount", ModelEnum.FINANCE_DATE.getValue() + "_获取汇总值"),
    FINANCE_DATE_DOWNLOAD_LIST(ClzConstant.FINANCE_DATE_QUERY + ".downloadList", ModelEnum.FINANCE_DATE.getKey(),"downloadList", ModelEnum.FINANCE_DATE.getValue() + "_下载列表"),
    FINANCE_DATE_DOWNLOAD_CLASSIFIED(ClzConstant.FINANCE_DATE_QUERY + ".downloadClassified", ModelEnum.FINANCE_DATE.getKey(),"downloadClassified", ModelEnum.FINANCE_DATE.getValue() + "_下载分类汇总"),
    FINANCE_DATE_GET_LAST_DOWNLOAD_COUNT(ClzConstant.FINANCE_DATE_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE_DATE.getKey(),"getLastDownloadCount", ModelEnum.FINANCE_DATE.getValue() + "_获取可导出excel次数"),

    FINANCE_DATE_TO_SUM_DATE(ClzConstant.FINANCE_DATE_COMMAND + ".toSumByDate", ModelEnum.FINANCE_DATE.getKey(),"toSumByDate", ModelEnum.FINANCE_DATE.getValue() + "_汇总某月"),

    FINANCE_WEEK_DOWNLOAD_LIST(ClzConstant.FINANCE_WEEK_QUERY + ".downloadList", ModelEnum.FINANCE_WEEK.getKey(),"downloadList", ModelEnum.FINANCE_WEEK.getValue() + "_下载列表"),
    FINANCE_WEEK_DOWNLOAD_WEEK_DETAIL(ClzConstant.FINANCE_WEEK_QUERY + ".downloadWeekDetail", ModelEnum.FINANCE_WEEK.getKey(),"downloadWeekDetail", ModelEnum.FINANCE_WEEK.getValue() + "_下载详细"),
    FINANCE_WEEK_LIST(ClzConstant.FINANCE_WEEK_QUERY + ".getPageList", ModelEnum.FINANCE_WEEK.getKey(),"getPageList", ModelEnum.FINANCE_WEEK.getValue() + "_查询列表"),
    FINANCE_WEEK_GET_SUM(ClzConstant.FINANCE_WEEK_QUERY + ".getSumAmount", ModelEnum.FINANCE_WEEK.getKey(),"getSumAmount", ModelEnum.FINANCE_WEEK.getValue() + "_获取汇总值"),
    FINANCE_WEEK_GET_LAST_DOWNLOAD_COUNT(ClzConstant.FINANCE_WEEK_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE_WEEK.getKey(),"getLastDownloadCount", ModelEnum.FINANCE_WEEK.getValue() + "_获取可导出excel次数"),
    FINANCE_WEEK_CLASSIFIED_WEEK(ClzConstant.FINANCE_WEEK_QUERY + ".getClassifiedWeek", ModelEnum.FINANCE_WEEK.getKey(),"getClassifiedWeek", ModelEnum.FINANCE_WEEK.getValue() + "_查询某周分类汇总"),
    FINANCE_WEEK_DOWNLOAD_WEEK_CLASSIFIED(ClzConstant.FINANCE_WEEK_QUERY + ".downloadClassifiedWeek", ModelEnum.FINANCE_WEEK.getKey(),"downloadClassifiedWeek", ModelEnum.FINANCE_WEEK.getValue() + "_下载某周分类汇总"),

    FINANCE_MONTH_CLASSIFIED_MONTH(ClzConstant.FINANCE_MONTH_QUERY + ".getClassifiedMonth", ModelEnum.FINANCE_MONTH.getKey(),"getClassifiedMonth", ModelEnum.FINANCE_MONTH.getValue() + "_查询某月分类汇总"),
    FINANCE_MONTH_CLASSIFIED(ClzConstant.FINANCE_MONTH_QUERY + ".getClassified", ModelEnum.FINANCE_MONTH.getKey(),"getClassified", ModelEnum.FINANCE_MONTH.getValue() + "_根据条件查询分类汇总"),
    FINANCE_MONTH_LIST(ClzConstant.FINANCE_MONTH_QUERY + ".getPageList", ModelEnum.FINANCE_MONTH.getKey(),"getPageList", ModelEnum.FINANCE_MONTH.getValue() + "_查询列表"),
    FINANCE_MONTH_GET(ClzConstant.FINANCE_MONTH_QUERY + ".getByMonth", ModelEnum.FINANCE_MONTH.getKey(),"getByMonth", ModelEnum.FINANCE_MONTH.getValue() + "_根据月获取"),
    FINANCE_MONTH_GET_SUM(ClzConstant.FINANCE_MONTH_QUERY + ".getSumAmount", ModelEnum.FINANCE_MONTH.getKey(),"getSumAmount", ModelEnum.FINANCE_MONTH.getValue() + "_获取汇总值"),
    FINANCE_MONTH_DOWNLOAD(ClzConstant.FINANCE_MONTH_QUERY + ".downloadMonth", ModelEnum.FINANCE_MONTH.getKey(),"downloadMonth", ModelEnum.FINANCE_MONTH.getValue() + "_下载列表"),
    FINANCE_MONTH_DOWNLOAD_MONTH_DETAIL(ClzConstant.FINANCE_MONTH_QUERY + ".downloadMonthDetail", ModelEnum.FINANCE_MONTH.getKey(),"downloadMonthDetail", ModelEnum.FINANCE_MONTH.getValue() + "_下载某月详细"),
    FINANCE_MONTH_DOWNLOAD_MONTH_CLASSIFIED(ClzConstant.FINANCE_MONTH_QUERY + ".downloadClassifiedMonth", ModelEnum.FINANCE_MONTH.getKey(),"downloadClassifiedMonth", ModelEnum.FINANCE_MONTH.getValue() + "_下载某月分类汇总"),
    FINANCE_MONTH_DOWNLOAD_CLASSIFIED(ClzConstant.FINANCE_MONTH_QUERY + ".downloadClassified", ModelEnum.FINANCE_MONTH.getKey(),"downloadClassified", ModelEnum.FINANCE_MONTH.getValue() + "_下载分类汇总"),
    FINANCE_MONTH_GET_LAST_DOWNLOAD_COUNT(ClzConstant.FINANCE_MONTH_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE_MONTH.getKey(),"getLastDownloadCount", ModelEnum.FINANCE_MONTH.getValue() + "_获取可导出excel次数"),

    FINANCE_MONTH_TO_SUM_MONTH(ClzConstant.FINANCE_MONTH_COMMAND + ".toSumByMonth", ModelEnum.FINANCE_MONTH.getKey(),"toSumByMonth", ModelEnum.FINANCE_MONTH.getValue() + "_汇总某月"),

    FINANCE_SEASON_DOWNLOAD_LIST(ClzConstant.FINANCE_SEASON_QUERY + ".downloadList", ModelEnum.FINANCE_SEASON.getKey(),"downloadList", ModelEnum.FINANCE_SEASON.getValue() + "_下载列表"),
    FINANCE_SEASON_LIST(ClzConstant.FINANCE_SEASON_QUERY + ".getPageList", ModelEnum.FINANCE_SEASON.getKey(),"getPageList", ModelEnum.FINANCE_SEASON.getValue() + "_查询列表"),
    FINANCE_SEASON_CLASSIFIED_MONTH(ClzConstant.FINANCE_SEASON_QUERY + ".getClassifiedSeason", ModelEnum.FINANCE_SEASON.getKey(),"getClassifiedSeason", ModelEnum.FINANCE_SEASON.getValue() + "_查询某季分类汇总"),
    FINANCE_SEASON_CLASSIFIED(ClzConstant.FINANCE_SEASON_QUERY + ".getClassified", ModelEnum.FINANCE_SEASON.getKey(),"getClassified", ModelEnum.FINANCE_SEASON.getValue() + "_根据条件查询分类汇总"),
    FINANCE_SEASON_GET_SUM(ClzConstant.FINANCE_SEASON_QUERY + ".getSumAmount", ModelEnum.FINANCE_SEASON.getKey(),"getSumAmount", ModelEnum.FINANCE_SEASON.getValue() + "_获取汇总值"),
    FINANCE_SEASON_DOWNLOAD_SEASON_DETAIL(ClzConstant.FINANCE_SEASON_QUERY + ".downloadSeasonDetail", ModelEnum.FINANCE_SEASON.getKey(),"downloadSeasonDetail", ModelEnum.FINANCE_SEASON.getValue() + "_下载某季详细"),
    FINANCE_SEASON_DOWNLOAD_SEASON_CLASSIFIED(ClzConstant.FINANCE_SEASON_QUERY + ".downloadClassifiedSeason", ModelEnum.FINANCE_SEASON.getKey(),"downloadClassifiedSeason", ModelEnum.FINANCE_SEASON.getValue() + "_下载某季分类汇总"),
    FINANCE_SEASON_DOWNLOAD_CLASSIFIED(ClzConstant.FINANCE_SEASON_QUERY + ".downloadClassified", ModelEnum.FINANCE_SEASON.getKey(),"downloadClassified", ModelEnum.FINANCE_SEASON.getValue() + "_下载分类汇总"),
    FINANCE_SEASON_GET_LAST_DOWNLOAD_COUNT(ClzConstant.FINANCE_SEASON_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE_SEASON.getKey(),"getLastDownloadCount", ModelEnum.FINANCE_SEASON.getValue() + "_获取可导出excel次数"),


    FINANCE_YEAR_LIST(ClzConstant.FINANCE_YEAR_QUERY + ".getPageList", ModelEnum.FINANCE_YEAR.getKey(),"getPageList", ModelEnum.FINANCE_YEAR.getValue() + "_查询列表"),
    FINANCE_YEAR_CLASSIFIED_MONTH(ClzConstant.FINANCE_YEAR_QUERY + ".getClassifiedYear", ModelEnum.FINANCE_YEAR.getKey(),"getClassifiedYear", ModelEnum.FINANCE_YEAR.getValue() + "_查询某年分类汇总"),
    FINANCE_YEAR_CLASSIFIED(ClzConstant.FINANCE_YEAR_QUERY + ".getClassified", ModelEnum.FINANCE_YEAR.getKey(),"getClassified", ModelEnum.FINANCE_YEAR.getValue() + "_根据条件查询分类汇总"),
    FINANCE_YEAR_GET_SUM(ClzConstant.FINANCE_YEAR_QUERY + ".getSumAmount", ModelEnum.FINANCE_YEAR.getKey(),"getSumAmount", ModelEnum.FINANCE_YEAR.getValue() + "_获取汇总值"),
    FINANCE_YEAR_DOWNLOAD_MONTH_DETAIL(ClzConstant.FINANCE_YEAR_QUERY + ".downloadYearDetail", ModelEnum.FINANCE_YEAR.getKey(),"downloadYearDetail", ModelEnum.FINANCE_YEAR.getValue() + "_下载某年详细"),
    FINANCE_YEAR_DOWNLOAD_MONTH_CLASSIFIED(ClzConstant.FINANCE_YEAR_QUERY + ".downloadClassifiedYear", ModelEnum.FINANCE_YEAR.getKey(),"downloadClassifiedYear", ModelEnum.FINANCE_YEAR.getValue() + "_下载某年分类汇总"),
    FINANCE_YEAR_DOWNLOAD_CLASSIFIED(ClzConstant.FINANCE_YEAR_QUERY + ".downloadClassified", ModelEnum.FINANCE_YEAR.getKey(),"downloadClassified", ModelEnum.FINANCE_YEAR.getValue() + "_下载分类汇总"),
    FINANCE_YEAR_GET_LAST_DOWNLOAD_COUNT(ClzConstant.FINANCE_YEAR_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE_YEAR.getKey(),"getLastDownloadCount", ModelEnum.FINANCE_YEAR.getValue() + "_获取可导出excel次数"),

    FINANCE_TRANSACTION_TYPE_ADD(ClzConstant.FINANCE_TRANSACTION_TYPE_COMMAND + ".add", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"add", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_新增"),
    FINANCE_TRANSACTION_TYPE_DEL(ClzConstant.FINANCE_TRANSACTION_TYPE_COMMAND + ".delete", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"delete", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_删除"),
    FINANCE_TRANSACTION_TYPE_UPDATE(ClzConstant.FINANCE_TRANSACTION_TYPE_COMMAND + ".update", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"update", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_修改"),

    FINANCE_TRANSACTION_TYPE_GET(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".get", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"get", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_根据id查询"),
    FINANCE_TRANSACTION_TYPE_LIST(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".getPageList", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"getPageList", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_查询列表"),
    FINANCE_TRANSACTION_TYPE_GET_SELECT(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".getSelect", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"getSelect", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_查询所有(下拉菜单)"),
    FINANCE_TRANSACTION_TYPE_JUST_UPDATED(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".ifJustUpdated", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"ifJustUpdated", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_是否不久前修改过"),
    FINANCE_TRANSACTION_GET_BY_ID_AND_CONDITION(ClzConstant.FINANCE_TRANSACTION_TYPE_QUERY + ".getByIdAndCondition", ModelEnum.FINANCE_TRANSACTION_TYPE.getKey(),"getByIdAndCondition", ModelEnum.FINANCE_TRANSACTION_TYPE.getValue() + "_根据id和其它条件查询"),


    FINANCE_COMMON_DOWNLOAD_LAST_COUNT(ClzConstant.FINANCE_COMMON_QUERY + ".getLastDownloadCount", ModelEnum.FINANCE_COMMON.getKey(),"getLastDownloadCount", ModelEnum.FINANCE_COMMON.getValue() + "_获取剩余下载次数"),
    FINANCE_COMMON_CLASSIFIED(ClzConstant.FINANCE_COMMON_QUERY + ".getClassified", ModelEnum.FINANCE_COMMON.getKey(),"getClassified", ModelEnum.FINANCE_COMMON.getValue() + "_获取分类汇总"),
    FINANCE_COMMON_GET_SUM(ClzConstant.FINANCE_COMMON_QUERY + ".getSumAmount", ModelEnum.FINANCE_COMMON.getKey(),"getSumAmount", ModelEnum.FINANCE_COMMON.getValue() + "_获取总额"),
    FINANCE_COMMON_GET_THIS_SUM(ClzConstant.FINANCE_COMMON_QUERY + ".getThisSum", ModelEnum.FINANCE_COMMON.getKey(),"getThisSum", ModelEnum.FINANCE_COMMON.getValue() + "_获取当天,本周..汇总"),


    //--------------------------------------------- product  start ----------------------------------------------------------------
    PRODUCT_OUTPUT_ADD(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".add", ModelEnum.PRODUCT_OUTPUT.getKey(),"add", ModelEnum.PRODUCT_OUTPUT.getValue() + "_新增"),
    PRODUCT_OUTPUT_DEL(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".delete", ModelEnum.PRODUCT_OUTPUT.getKey(),"delete", ModelEnum.PRODUCT_OUTPUT.getValue() + "_删除"),
    PRODUCT_OUTPUT_UPDATE(ClzConstant.PRODUCT_OUTPUT_COMMAND + ".update", ModelEnum.PRODUCT_OUTPUT.getKey(),"update", ModelEnum.PRODUCT_OUTPUT.getValue() + "_修改"),

    PRODUCT_OUTPUT_DOWNLOAD(ClzConstant.PRODUCT_OUTPUT_QUERY + ".download", ModelEnum.PRODUCT_OUTPUT.getKey(),"download", ModelEnum.PRODUCT_OUTPUT.getValue() + "_下载"),
    PRODUCT_OUTPUT_GET(ClzConstant.PRODUCT_OUTPUT_QUERY + ".get", ModelEnum.PRODUCT_OUTPUT.getKey(),"get", ModelEnum.PRODUCT_OUTPUT.getValue() + "_根据id查询"),
    PRODUCT_OUTPUT_LIST(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getPageList", ModelEnum.PRODUCT_OUTPUT.getKey(),"getPageList", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询列表"),
    PRODUCT_OUTPUT_GET_COUNT(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getCount", ModelEnum.PRODUCT_OUTPUT.getKey(),"getCount", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询数据总数"),
    PRODUCT_OUTPUT_GET_SUM(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getSumNumber", ModelEnum.PRODUCT_OUTPUT.getKey(),"getSumNumber", ModelEnum.PRODUCT_OUTPUT.getValue() + "_查询汇总数量"),
    PRODUCT_OUTPUT_GET_LAST_DOWNLOAD_COUNT(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getLastDownloadCount", ModelEnum.PRODUCT_OUTPUT.getKey(),"getLastDownloadCount", ModelEnum.PRODUCT_OUTPUT.getValue() + "_获取可导出excel次数"),
    PRODUCT_OUTPUT_GET_BY_ID_AND_CONDITION(ClzConstant.PRODUCT_OUTPUT_QUERY + ".getByIdAndCondition", ModelEnum.PRODUCT_OUTPUT.getKey(),"getByIdAndCondition", ModelEnum.PRODUCT_OUTPUT.getValue() + "_根据id和其它条件查询"),

    PRODUCT_ADD(ClzConstant.PRODUCT_COMMAND + ".add", ModelEnum.PRODUCT.getKey(),"add", ModelEnum.PRODUCT.getValue() + "_新增"),
    PRODUCT_DEL(ClzConstant.PRODUCT_COMMAND + ".delete", ModelEnum.PRODUCT.getKey(),"delete", ModelEnum.PRODUCT.getValue() + "_删除"),
    PRODUCT_UPDATE(ClzConstant.PRODUCT_COMMAND + ".update", ModelEnum.PRODUCT.getKey(),"update", ModelEnum.PRODUCT.getValue() + "_修改"),

    PRODUCT_GET(ClzConstant.PRODUCT_QUERY + ".get", ModelEnum.PRODUCT.getKey(),"get", ModelEnum.PRODUCT.getValue() + "_根据id查询"),
    PRODUCT_LIST(ClzConstant.PRODUCT_QUERY + ".getPageList", ModelEnum.PRODUCT.getKey(),"getPageList", ModelEnum.PRODUCT.getValue() + "_查询列表"),
    PRODUCT_GET_BIG_IMG(ClzConstant.PRODUCT_QUERY + ".getBigImg", ModelEnum.PRODUCT.getKey(),"getBigImg", ModelEnum.PRODUCT.getValue() + "_获取大图"),
    PRODUCT_GET_BY_UUID(ClzConstant.PRODUCT_QUERY + ".getByUuid", ModelEnum.PRODUCT.getKey(),"getByUuid", ModelEnum.PRODUCT.getValue() + "_根据UUID查询"),
    PRODUCT_GET_UNIT_SELECT(ClzConstant.PRODUCT_QUERY + ".getUnitSelect", ModelEnum.PRODUCT.getKey(),"getUnitSelect", ModelEnum.PRODUCT.getValue() + "_查询单位下拉"),
    PRODUCT_JUST_UPDATED(ClzConstant.PRODUCT_QUERY + ".ifJustUpdated", ModelEnum.PRODUCT.getKey(),"ifJustUpdated", ModelEnum.PRODUCT.getValue() + "_是否不久前修改过"),
    PRODUCT_GET_LAST_DOWNLOAD_COUNT(ClzConstant.PRODUCT_QUERY + ".getLastDownloadCount", ModelEnum.PRODUCT.getKey(),"getLastDownloadCount", ModelEnum.PRODUCT.getValue() + "_获取可导出excel次数"),
    PRODUCT_GET_BY_ID_AND_CONDITION(ClzConstant.PRODUCT_QUERY + ".getByIdAndCondition", ModelEnum.PRODUCT.getKey(),"getByIdAndCondition", ModelEnum.PRODUCT.getValue() + "_根据id和其它条件查询"),

    PRODUCT_OUTPUT_MONTH_LIST(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getPageList", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"getPageList", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_查询列表"),
    PRODUCT_OUTPUT_MONTH_GET(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getByMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"getByMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_查询某个月"),
    PRODUCT_OUTPUT_MONTH_DOWNLOAD(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".download", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"download", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "下载"),
    PRODUCT_OUTPUT_MONTH_DOWNLOAD_DETAIL(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".downloadMonthDetail", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"downloadMonthDetail", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "下载某月明细"),
    PRODUCT_OUTPUT_MONTH_GET_SUM(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getSumNumber", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"getSumNumber", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_查询某个计量物的汇总"),
    PRODUCT_OUTPUT_MONTH_GET_LAST_DOWNLOAD_COUNT(ClzConstant.PRODUCT_OUTPUT_MONTH_QUERY + ".getLastDownloadCount", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"getLastDownloadCount", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_获取可导出excel次数"),

    PRODUCT_OUTPUT_MONTH_TO_SUM(ClzConstant.PRODUCT_OUTPUT_MONTH_COMMAND + ".toSumByProductAndMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"toSumByProductAndMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_汇总某个月"),
    PRODUCT_OUTPUT_MONTH_TO_SUM_RECENT(ClzConstant.PRODUCT_OUTPUT_MONTH_COMMAND + ".toSumByRecentMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getKey(),"toSumByRecentMonth", ModelEnum.PRODUCT_OUTPUT_MONTH.getValue() + "_汇总最近几个月"),

    PRODUCT_OUTPUT_YEAR_LIST(ClzConstant.PRODUCT_OUTPUT_YEAR_QUERY + ".getPageList", ModelEnum.PRODUCT_OUTPUT_YEAR.getKey(),"getPageList", ModelEnum.PRODUCT_OUTPUT_YEAR.getValue() + "_查询列表"),
    PRODUCT_OUTPUT_YEAR_DOWNLOAD(ClzConstant.PRODUCT_OUTPUT_YEAR_QUERY + ".download", ModelEnum.PRODUCT_OUTPUT_YEAR.getKey(),"download", ModelEnum.PRODUCT_OUTPUT_YEAR.getValue() + "下载"),
    PRODUCT_OUTPUT_YEAR_DOWNLOAD_DETAIL(ClzConstant.PRODUCT_OUTPUT_YEAR_QUERY + ".downloadYearDetail", ModelEnum.PRODUCT_OUTPUT_YEAR.getKey(),"downloadYearDetail", ModelEnum.PRODUCT_OUTPUT_YEAR.getValue() + "下载某年明细"),
    PRODUCT_OUTPUT_YEAR_GET_SUM(ClzConstant.PRODUCT_OUTPUT_YEAR_QUERY + ".getSumNumber", ModelEnum.PRODUCT_OUTPUT_YEAR.getKey(),"getSumNumber", ModelEnum.PRODUCT_OUTPUT_YEAR.getValue() + "_查询某个计量物的汇总"),
    PRODUCT_OUTPUT_YEAR_GET_LAST_DOWNLOAD_COUNT(ClzConstant.PRODUCT_OUTPUT_YEAR_QUERY + ".getLastDownloadCount", ModelEnum.PRODUCT_OUTPUT_YEAR.getKey(),"getLastDownloadCount", ModelEnum.PRODUCT_OUTPUT_YEAR.getValue() + "_获取可导出excel次数"),

    //--------------------------------------------- goods  start ----------------------------------------------------------------
    GOODS_TRADE_ADD(ClzConstant.GOODS_TRADE_COMMAND + ".add", ModelEnum.GOODS_TRADE.getKey(),"add", ModelEnum.GOODS_TRADE.getValue() + "_新增"),
    GOODS_TRADE_DEL(ClzConstant.GOODS_TRADE_COMMAND + ".delete", ModelEnum.GOODS_TRADE.getKey(),"delete", ModelEnum.GOODS_TRADE.getValue() + "_删除"),
    GOODS_TRADE_UPDATE(ClzConstant.GOODS_TRADE_COMMAND + ".update", ModelEnum.GOODS_TRADE.getKey(),"update", ModelEnum.GOODS_TRADE.getValue() + "_修改"),

    GOODS_TRADE_DOWNLOAD(ClzConstant.GOODS_TRADE_QUERY + ".download", ModelEnum.GOODS_TRADE.getKey(),"download", ModelEnum.GOODS_TRADE.getValue() + "_下载"),
    GOODS_TRADE_GET(ClzConstant.GOODS_TRADE_QUERY + ".get", ModelEnum.GOODS_TRADE.getKey(),"get", ModelEnum.GOODS_TRADE.getValue() + "_根据id查询"),
    GOODS_TRADE_LIST(ClzConstant.GOODS_TRADE_QUERY + ".getPageList", ModelEnum.GOODS_TRADE.getKey(),"getPageList", ModelEnum.GOODS_TRADE.getValue() + "_查询列表"),
    GOODS_TRADE_GET_COUNT(ClzConstant.GOODS_TRADE_QUERY + ".getCount", ModelEnum.GOODS_TRADE.getKey(),"getCount", ModelEnum.GOODS_TRADE.getValue() + "_查询数据总数"),
    GOODS_TRADE_GET_SUM(ClzConstant.GOODS_TRADE_QUERY + ".getSumAmount", ModelEnum.GOODS_TRADE.getKey(),"getSumAmount", ModelEnum.GOODS_TRADE.getValue() + "_查询汇总金额"),
    GOODS_TRADE_GET_BIG_IMG(ClzConstant.GOODS_TRADE_QUERY + ".getBigImg", ModelEnum.GOODS_TRADE.getKey(),"getBigImg", ModelEnum.GOODS_TRADE.getValue() + "_查询大图"),
    GOODS_TRADE_GET_TRADE_TYPE(ClzConstant.GOODS_TRADE_QUERY + ".getTradeType", ModelEnum.GOODS_TRADE.getKey(),"getTradeType", ModelEnum.GOODS_TRADE.getValue() + "_查询交易类型"),
    GOODS_TRADE_GET_LAST_DOWNLOAD_COUNT(ClzConstant.GOODS_TRADE_QUERY + ".getLastDownloadCount", ModelEnum.GOODS_TRADE.getKey(),"getLastDownloadCount", ModelEnum.GOODS_TRADE.getValue() + "_获取可导出excel次数"),
    GOODS_TRADE_GET_BY_ID_AND_CONDITION(ClzConstant.GOODS_TRADE_QUERY + ".getByIdAndCondition", ModelEnum.GOODS_TRADE.getKey(),"getByIdAndCondition", ModelEnum.GOODS_TRADE.getValue() + "_根据id和其它条件查询"),

    GOODS_TRADE_MONTH_LIST(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getPageList", ModelEnum.GOODS_TRADE_MONTH.getKey(),"getPageList", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_查询列表"),
    GOODS_TRADE_MONTH_GET_CLASSIFIED_MONTH(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getClassifiedMonth", ModelEnum.GOODS_TRADE_MONTH.getKey(),"getClassifiedMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_按月查询分类汇总"),
    GOODS_TRADE_MONTH_GET_CLASSIFIED_SUM(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getClassified", ModelEnum.GOODS_TRADE_MONTH.getKey(),"getClassified", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_按条件查询分类汇总"),
    GOODS_TRADE_MONTH_GET(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getByMonth", ModelEnum.GOODS_TRADE_MONTH.getKey(),"getByMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_查询某月"),
    GOODS_TRADE_MONTH_SUM(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getSumAmount", ModelEnum.GOODS_TRADE_MONTH.getKey(),"getSumAmount", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_查询汇总金额"),
    GOODS_TRADE_MONTH_DOWNLOAD(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".download", ModelEnum.GOODS_TRADE_MONTH.getKey(),"download", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_下载"),
    GOODS_TRADE_MONTH_DOWNLOAD_DETAIL(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".downloadMonthDetail", ModelEnum.GOODS_TRADE_MONTH.getKey(),"downloadMonthDetail", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_下载某月明细"),
    GOODS_TRADE_MONTH_DOWNLOAD_MONTH_CLASSIFIED(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".downloadClassifiedMonth", ModelEnum.GOODS_TRADE_MONTH.getKey(),"downloadClassifiedMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_下载某月分类汇总"),
    GOODS_TRADE_MONTH_DOWNLOAD_CLASSIFIED(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".downloadClassified", ModelEnum.GOODS_TRADE_MONTH.getKey(),"downloadClassified", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_下载分类汇总"),
    GOODS_TRADE_MONTH_GET_LAST_DOWNLOAD_COUNT(ClzConstant.GOODS_TRADE_MONTH_QUERY + ".getLastDownloadCount", ModelEnum.GOODS_TRADE_MONTH.getKey(),"getLastDownloadCount", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_获取可导出excel次数"),

    GOODS_TRADE_MONTH_TO_SUM(ClzConstant.GOODS_TRADE_MONTH_COMMAND + ".toSumByMonth", ModelEnum.GOODS_TRADE_MONTH.getKey(),"toSumByMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_汇总某月"),
    GOODS_TRADE_MONTH_TO_SUM_RECENT(ClzConstant.GOODS_TRADE_MONTH_COMMAND + ".toSumByRecentMonth", ModelEnum.GOODS_TRADE_MONTH.getKey(),"toSumByRecentMonth", ModelEnum.GOODS_TRADE_MONTH.getValue() + "_汇总最近几月"),

    GOODS_TRADE_YEAR_LIST(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".getPageList", ModelEnum.GOODS_TRADE_YEAR.getKey(),"getPageList", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_查询列表"),
    GOODS_TRADE_YEAR_CLASSIFIED_MONTH(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".getClassifiedYear", ModelEnum.GOODS_TRADE_YEAR.getKey(),"getClassifiedYear", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_查询某年分类汇总"),
    GOODS_TRADE_YEAR_CLASSIFIED(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".getClassified", ModelEnum.GOODS_TRADE_YEAR.getKey(),"getClassified", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_根据条件查询分类汇总"),
    GOODS_TRADE_YEAR_GET_SUM(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".getYearSumAmount", ModelEnum.GOODS_TRADE_YEAR.getKey(),"getYearSumAmount", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_获取汇总值"),
    GOODS_TRADE_YEAR_DOWNLOAD_MONTH_DETAIL(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".downloadYearDetail", ModelEnum.GOODS_TRADE_YEAR.getKey(),"downloadYearDetail", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_下载某年详细"),
    GOODS_TRADE_YEAR_DOWNLOAD_MONTH_CLASSIFIED(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".downloadClassifiedYear", ModelEnum.GOODS_TRADE_YEAR.getKey(),"downloadClassifiedYear", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_下载某年分类汇总"),
    GOODS_TRADE_YEAR_DOWNLOAD_CLASSIFIED(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".downloadClassified", ModelEnum.GOODS_TRADE_YEAR.getKey(),"downloadClassified", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_下载分类汇总"),
    GOODS_TRADE_YEAR_GET_LAST_DOWNLOAD_COUNT(ClzConstant.GOODS_TRADE_YEAR_QUERY + ".getLastDownloadCount", ModelEnum.GOODS_TRADE_YEAR.getKey(),"getLastDownloadCount", ModelEnum.GOODS_TRADE_YEAR.getValue() + "_获取可导出excel次数"),

    GOODS_ADD(ClzConstant.GOODS_COMMAND + ".add", ModelEnum.GOODS.getKey(),"add", ModelEnum.GOODS.getValue() + "_新增"),
    GOODS_DEL(ClzConstant.GOODS_COMMAND + ".delete", ModelEnum.GOODS.getKey(),"delete", ModelEnum.GOODS.getValue() + "_删除"),
    GOODS_UPDATE(ClzConstant.GOODS_COMMAND + ".update", ModelEnum.GOODS.getKey(),"update", ModelEnum.GOODS.getValue() + "_修改"),

    GOODS_DOWNLOAD(ClzConstant.GOODS_QUERY + ".download", ModelEnum.GOODS.getKey(),"download", ModelEnum.GOODS.getValue() + "_下载"),
    GOODS_GET(ClzConstant.GOODS_QUERY + ".get", ModelEnum.GOODS.getKey(),"get", ModelEnum.GOODS.getValue() + "_查询一个"),
    GOODS_GET_BIG_IMG(ClzConstant.GOODS_QUERY + ".getBigImg", ModelEnum.GOODS.getKey(),"getBigImg", ModelEnum.GOODS.getValue() + "_查询大图"),
    GOODS_LIST(ClzConstant.GOODS_QUERY + ".getPageList", ModelEnum.GOODS.getKey(),"getPageList", ModelEnum.GOODS.getValue() + "_查询列表"),
    GOODS_GET_SELECT(ClzConstant.GOODS_QUERY + ".getSelect", ModelEnum.GOODS.getKey(),"getSelect", ModelEnum.GOODS.getValue() + "_查询下拉"),
    GOODS_GET_BY_UUID(ClzConstant.GOODS_QUERY + ".getByUuid", ModelEnum.GOODS.getKey(),"getByUuid", ModelEnum.GOODS.getValue() + "_根据UUID查询"),
    GOODS_GET_UNIT_SELECT(ClzConstant.GOODS_QUERY + ".getUnitSelect", ModelEnum.GOODS.getKey(),"getUnitSelect", ModelEnum.GOODS.getValue() + "_查询单位下拉"),
    GOODS_JUST_UPDATED(ClzConstant.GOODS_QUERY + ".ifJustUpdated", ModelEnum.GOODS.getKey(),"ifJustUpdated", ModelEnum.GOODS.getValue() + "_是否不久前修改过"),
    GOODS_GET_LAST_DOWNLOAD_COUNT(ClzConstant.GOODS_QUERY + ".getLastDownloadCount", ModelEnum.GOODS.getKey(),"getLastDownloadCount", ModelEnum.GOODS.getValue() + "_获取可导出excel次数"),
    GOODS_GET_BY_ID_AND_CONDITION(ClzConstant.GOODS_QUERY + ".getByIdAndCondition", ModelEnum.GOODS.getKey(),"getByIdAndCondition", ModelEnum.GOODS.getValue() + "_根据id和其它条件查询"),

    SUPPLIER_ADD(ClzConstant.SUPPLIER_COMMAND + ".add", ModelEnum.SUPPLIER.getKey(),"add", ModelEnum.SUPPLIER.getValue() + "_新增"),
    SUPPLIER_DEL(ClzConstant.SUPPLIER_COMMAND + ".delete", ModelEnum.SUPPLIER.getKey(),"delete", ModelEnum.SUPPLIER.getValue() + "_删除"),
    SUPPLIER_UPDATE(ClzConstant.SUPPLIER_COMMAND + ".update", ModelEnum.SUPPLIER.getKey(),"update", ModelEnum.SUPPLIER.getValue() + "_修改"),

    SUPPLIER_LIST(ClzConstant.SUPPLIER_QUERY + ".getPageList", ModelEnum.SUPPLIER.getKey(),"getPageList", ModelEnum.SUPPLIER.getValue() + "_查询列表"),
    SUPPLIER_GET(ClzConstant.SUPPLIER_QUERY + ".get", ModelEnum.SUPPLIER.getKey(),"get", ModelEnum.SUPPLIER.getValue() + "_查询一个"),
    SUPPLIER_GET_BY_UUID(ClzConstant.SUPPLIER_QUERY + ".getByUuid", ModelEnum.SUPPLIER.getKey(),"getByUuid", ModelEnum.SUPPLIER.getValue() + "_根据uuid查询一个"),
    SUPPLIER_DOWNLOAD(ClzConstant.SUPPLIER_QUERY + ".download", ModelEnum.SUPPLIER.getKey(),"download", ModelEnum.SUPPLIER.getValue() + "_下载"),
    SUPPLIERS_GET_SUPPLIER_TYPE(ClzConstant.SUPPLIER_QUERY + ".getSupplierType", ModelEnum.SUPPLIER.getKey(),"getSupplierType", ModelEnum.SUPPLIER.getValue() + "_获取供应商类型下拉"),
    SUPPLIERS_GET_SELECT(ClzConstant.SUPPLIER_QUERY + ".getSelect", ModelEnum.SUPPLIER.getKey(),"getSelect", ModelEnum.SUPPLIER.getValue() + "_获取供应商下拉菜单"),
    SUPPLIERS_JUST_UPDATED(ClzConstant.SUPPLIER_QUERY + ".ifJustUpdated", ModelEnum.SUPPLIER.getKey(),"ifJustUpdated", ModelEnum.SUPPLIER.getValue() + "_是否不久前修改过"),
    SUPPLIERS_GET_LAST_DOWNLOAD_COUNT(ClzConstant.SUPPLIER_QUERY + ".getLastDownloadCount", ModelEnum.SUPPLIER.getKey(),"getLastDownloadCount", ModelEnum.SUPPLIER.getValue() + "_获取可导出excel次数"),
    SUPPLIERS_GET_BY_ID_AND_CONDITION(ClzConstant.SUPPLIER_QUERY + ".getByIdAndCondition", ModelEnum.SUPPLIER.getKey(),"getByIdAndCondition", ModelEnum.SUPPLIER.getValue() + "_根据id和其它条件查询"),

    //--------------------------------------------- share area  start ----------------------------------------------------------------
    SHARE_AREA_ADD(ClzConstant.SHARE_AREA_COMMAND + ".add", ModelEnum.SHARE_AREA.getKey(),"add", ModelEnum.SHARE_AREA.getValue() + "_新增"),
    SHARE_AREA_DEL(ClzConstant.SHARE_AREA_COMMAND + ".delete", ModelEnum.SHARE_AREA.getKey(),"delete", ModelEnum.SHARE_AREA.getValue() + "_删除"),

    SHARE_AREA_LIST(ClzConstant.SHARE_AREA_QUERY + ".getPageList", ModelEnum.SHARE_AREA.getKey(),"getPageList", ModelEnum.SHARE_AREA.getValue() + "_查询列表"),
    SHARE_AREA_GET_BY_ID_AND_CONDITION(ClzConstant.SHARE_AREA_QUERY + ".getByIdAndCondition", ModelEnum.SHARE_AREA.getKey(),"getByIdAndCondition", ModelEnum.SHARE_AREA.getValue() + "_根据id和其它条件查询"),

    //--------------------------------------------- share user  start ----------------------------------------------------------------
    SHARE_USER_ADD(ClzConstant.SHARE_USER_COMMAND + ".add", ModelEnum.SHARE_USER.getKey(),"add", ModelEnum.SHARE_USER.getValue() + "_新增"),
    SHARE_USER_DEL(ClzConstant.SHARE_USER_COMMAND + ".delete", ModelEnum.SHARE_USER.getKey(),"delete", ModelEnum.SHARE_USER.getValue() + "_删除"),
    SHARE_USER_UPDATE(ClzConstant.SHARE_USER_COMMAND + ".update", ModelEnum.SHARE_USER.getKey(),"update", ModelEnum.SHARE_USER.getValue() + "_修改"),
    SHARE_USER_FREEZE(ClzConstant.SHARE_USER_COMMAND + ".freeze", ModelEnum.SHARE_USER.getKey(),"freeze", ModelEnum.SHARE_USER.getValue() + "_冻结"),
    SHARE_USER_UNFREEZE(ClzConstant.SHARE_USER_COMMAND + ".unfreeze", ModelEnum.SHARE_USER.getKey(),"unfreeze", ModelEnum.SHARE_USER.getValue() + "_解冻"),

    SHARE_USER_LIST(ClzConstant.SHARE_USER_QUERY + ".getList", ModelEnum.SHARE_USER.getKey(),"getList", ModelEnum.SHARE_USER.getValue() + "_查询列表"),
    SHARE_USER_GET(ClzConstant.SHARE_USER_QUERY + ".get", ModelEnum.SHARE_USER.getKey(),"get", ModelEnum.SHARE_USER.getValue() + "_查询一个"),
    SHARE_USER_COUNT(ClzConstant.SHARE_USER_QUERY + ".getCount", ModelEnum.SHARE_USER.getKey(),"getCount", ModelEnum.SHARE_USER.getValue() + "_查询总数"),

    //--------------------------------------------- user  start ----------------------------------------------------------------
    USER_UPDATE(ClzConstant.USER_COMMAND + ".update", ModelEnum.USER.getKey(),"update", ModelEnum.USER.getValue() + "_修改"),
    USER_UPDATE_PASSWORD(ClzConstant.USER_COMMAND + ".updatePassword", ModelEnum.USER.getKey(),"updatePassword", ModelEnum.USER.getValue() + "_修改密码"),
    USER_UPDATE_AVATAR(ClzConstant.USER_COMMAND + ".updateAvatar", ModelEnum.USER.getKey(),"updateAvatar", ModelEnum.USER.getValue() + "_修改头像"),
    USER_UPDATE_QUESTION(ClzConstant.USER_COMMAND + ".updateQuestion", ModelEnum.USER.getKey(),"updateQuestion", ModelEnum.USER.getValue() + "_修改问题"),
    USER_CHECK_PASSWORD(ClzConstant.USER_COMMAND + ".checkPassword", ModelEnum.USER.getKey(),"checkPassword", ModelEnum.USER.getValue() + "_校验密码"),
    USER_CANCEL(ClzConstant.USER_COMMAND + ".cancel", ModelEnum.USER.getKey(),"cancel", ModelEnum.USER.getValue() + "_注销"),
    USER_JUST_UPDATE_PASS(ClzConstant.USER_COMMAND + ".justUpdatePass", ModelEnum.USER.getKey(),"justUpdatePass", ModelEnum.USER.getValue() + "_刚刚修改密码"),


    USER_GET(ClzConstant.USER_QUERY + ".get", ModelEnum.USER.getKey(),"get", ModelEnum.USER.getValue() + "_查询一个"),
    USER_GET_AVATAR(ClzConstant.USER_QUERY + ".getAvatar", ModelEnum.USER.getKey(),"getAvatar", ModelEnum.USER.getValue() + "_查询头像"),
    USER_GET_GENDER(ClzConstant.USER_QUERY + ".getGender", ModelEnum.USER.getKey(),"getGender", ModelEnum.USER.getValue() + "_查询性别下拉"),
    USER_GET_HOME_PAGE(ClzConstant.USER_QUERY + ".getHomePage", ModelEnum.USER.getKey(),"getHomePage", ModelEnum.USER.getValue() + "_查询可以选择的默认页菜单"),
    USER_GET_QUESTION_ANSWER(ClzConstant.USER_QUERY + ".getQuestionAndAnswer", ModelEnum.USER.getKey(),"getQuestionAndAnswer", ModelEnum.USER.getValue() + "_查询问题和答案"),
    USER_IF_HAS_SET_QUESTION(ClzConstant.USER_QUERY + ".ifHasSetQuestion", ModelEnum.USER.getKey(),"ifHasSetQuestion", ModelEnum.USER.getValue() + "_是否已设置问题"),
    USER_GET_ACTIVE_DAYS(ClzConstant.USER_QUERY + ".getActiveDays", ModelEnum.USER.getKey(),"getActiveDays", ModelEnum.USER.getValue() + "_查询活跃天数"),

    USER_NOTICE_READ_ONE(ClzConstant.USER_NOTICE + ".readOne", ModelEnum.USER_NOTICE.getKey(),"readOne", ModelEnum.USER_NOTICE.getValue() + "_读一条"),
    USER_NOTICE_GET_ONE(ClzConstant.USER_NOTICE + ".getOne", ModelEnum.USER_NOTICE.getKey(),"getOne", ModelEnum.USER_NOTICE.getValue() + "_查一条"),

    CONFIG_EXCEL_SWITCH(ClzConstant.CONFIG + ".excelExportSwitch", ModelEnum.CONFIG.getKey(),"excelExportSwitch", ModelEnum.CONFIG.getValue() + "_获取excel开关"),
    CONFIG_GET_CONTACT(ClzConstant.CONFIG + ".getContact", ModelEnum.CONFIG.getKey(),"getContact", ModelEnum.CONFIG.getValue() + "_获取联系方式"),

    ;

    private String method;

    private String modelCode;

    private String functionCode;

    private String desc;

    ModelFunctionEnum(String method, String modelCode, String functionCode, String desc) {
        this.method = method;
        this.modelCode = modelCode;
        this.functionCode = functionCode;
        this.desc = desc;
    }

    public String getMethod() {
        return method;
    }

    public String getModelCode() {
        return modelCode;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public String getDesc() {
        return desc;
    }

    public static String getFunctionCode(String method) {
        return methodToFunctionCodeMap.get(method);
    }

    public static String getDesc(String function) {
        return functionToDescMap.get(function);
    }

    public static Map<String, String> methodToModelCodeMap = new HashMap<>();

    public static Map<String, String> methodToFunctionCodeMap = new HashMap<>();

    public static Map<String, String> functionToDescMap = new HashMap<>();

    static {
        for (ModelFunctionEnum modelFunctionEnum : EnumSet.allOf(ModelFunctionEnum.class)) {
            methodToModelCodeMap.put(modelFunctionEnum.getMethod(), modelFunctionEnum.getModelCode());
            methodToFunctionCodeMap.put(modelFunctionEnum.getMethod(), modelFunctionEnum.getFunctionCode());
            functionToDescMap.put(modelFunctionEnum.getModelCode() + "_" + modelFunctionEnum.getFunctionCode(), modelFunctionEnum.getDesc());
        }
    }

}
