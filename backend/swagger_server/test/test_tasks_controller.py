# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.material import Material  # noqa: E501
from swagger_server.models.task import Task  # noqa: E501
from swagger_server.test import BaseTestCase


class TestTasksController(BaseTestCase):
    """TasksController integration test stubs"""

    def test_workspaces_workspace_id_topics_topic_id_tasks_get(self):
        """Test case for workspaces_workspace_id_topics_topic_id_tasks_get

        Get all tasks for a topic
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/tasks'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_tasks_post(self):
        """Test case for workspaces_workspace_id_topics_topic_id_tasks_post

        Create new task for the specified topic
        """
        task = None
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/tasks'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='POST',
            data=json.dumps(task),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_tasks_task_id_get(self):
        """Test case for workspaces_workspace_id_topics_topic_id_tasks_task_id_get

        Return specified task
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/tasks/{taskId}'.format(workspaceId='workspaceId_example', topicId='topicId_example', taskId='taskId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_tasks_task_id_put(self):
        """Test case for workspaces_workspace_id_topics_topic_id_tasks_task_id_put

        Update task specified by id, return task
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/tasks/{taskId}'.format(workspaceId='workspaceId_example', topicId='topicId_example', taskId='taskId_example'),
            method='PUT',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_tasks_task_id_submit_post(self):
        """Test case for workspaces_workspace_id_topics_topic_id_tasks_task_id_submit_post

        Submit the completed task
        """
        task = None
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/tasks/{taskId}/submit'.format(workspaceId='workspaceId_example', topicId='topicId_example', taskId='taskId_example'),
            method='POST',
            data=json.dumps(task),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
