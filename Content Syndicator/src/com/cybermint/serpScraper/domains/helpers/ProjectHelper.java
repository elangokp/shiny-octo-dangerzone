/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.domains.helpers;

import com.cybermint.serpScraper.domains.Project;
import com.cybermint.serpScraper.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class ProjectHelper {

    Session session;

    public ProjectHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public Project getProjectById(Integer projectId) {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Project aProject = (Project) session.createQuery("from Project prj where prj.projectId=" + projectId).uniqueResult();
        //session.close();
        return aProject;
    }

    public Integer saveNewProject(String projectName, String projectDesc) {
        Project aProject = new Project(projectName, projectDesc);
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        t.begin();
        Integer projectId = (Integer) session.save(aProject);
        t.commit();
        return projectId;
    }

    public static void main(String args[]) {
        ProjectHelper aProjectHelper = new ProjectHelper();
        Integer projectId = aProjectHelper.saveNewProject("Sample Project Name", "Sample Project Desc");
        System.out.println("Project ID for the saved project is : " + projectId);
        System.out.println(aProjectHelper.getProjectById(projectId).getProjectId());
    }
}
