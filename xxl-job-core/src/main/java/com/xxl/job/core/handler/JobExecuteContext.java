package com.xxl.job.core.handler;

public class JobExecuteContext {

    private int jobId ;

    private Integer shardTotal ;

    private Integer shardIndex ;

    public JobExecuteContext(int jobId, Integer shardTotal, Integer shardIndex) {
        this.jobId = jobId;
        this.shardTotal = shardTotal;
        this.shardIndex = shardIndex;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public Integer getShardTotal() {
        return shardTotal;
    }

    public void setShardTotal(Integer shardTotal) {
        this.shardTotal = shardTotal;
    }

    public Integer getShardIndex() {
        return shardIndex;
    }

    public void setShardIndex(Integer shardIndex) {
        this.shardIndex = shardIndex;
    }

    @Override
    public String toString() {
        return "JobExecuteContext{" +
                "jobId=" + jobId +
                ", shardTotal=" + shardTotal +
                ", shardIndex=" + shardIndex +
                '}';
    }
}
