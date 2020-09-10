package com.chaochaogu.design.pattern.iterator.example;

import java.util.List;

/**
 * 项目迭代器
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class ProjectIterator implements IProjectIterator {
    private List<IProject> projects;
    private int currentItem = 0;

    /**
     * 构造函数传入projects
     *
     * @param projects
     */
    public ProjectIterator(List<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        boolean result = true;
        if (this.currentItem >= projects.size() || this.projects.get(this.currentItem) == null) {
            result = false;
        }
        return result;
    }

    @Override
    public IProject next() {
        return this.projects.get(this.currentItem++);
    }
}
