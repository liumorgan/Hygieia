package com.capitalone.dashboard.response;

import com.capitalone.dashboard.model.Commit;
import com.capitalone.dashboard.model.GitRequest;
import com.capitalone.dashboard.status.CodeReviewAuditStatus;

import java.util.ArrayList;
import java.util.List;

public class CodeReviewAuditResponseV2 extends AuditReviewResponse<CodeReviewAuditStatus> {

    public static class PullRequestAudit extends AuditReviewResponse<CodeReviewAuditStatus>{
        GitRequest pullRequest;

        public GitRequest getPullRequest() {
            return pullRequest;
        }

        public void setPullRequest(GitRequest pullRequest) {
            this.pullRequest = pullRequest;
        }
    }
    private String url;
    private String branch;
    private long lastCommitTime;
    private long lastPRMergeTime;
    private List<Commit> directCommits = new ArrayList<>();
    private List<PullRequestAudit> pullRequests = new ArrayList<>();


    public List<PullRequestAudit> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<PullRequestAudit> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public List<Commit> getDirectCommits() {
        return directCommits;
    }

    public void setDirectCommits(List<Commit> directCommits) {
        this.directCommits = directCommits;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void addPullRequest (PullRequestAudit pull) {
        pullRequests.add(pull);
    }

    public void addDirectCommit (Commit commit) {
        directCommits.add(commit);
    }

    public long getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(long lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public long getLastPRMergeTime() {
        return lastPRMergeTime;
    }

    public void setLastPRMergeTime(long lastPRMergeTime) {
        this.lastPRMergeTime = lastPRMergeTime;
    }
}