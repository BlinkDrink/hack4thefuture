# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.topic import Topic  # noqa: E501
from swagger_server.models.workspace import Workspace  # noqa: E501
from swagger_server.test import BaseTestCase


class TestWorkspacesController(BaseTestCase):
    """WorkspacesController integration test stubs"""

    def test_workspaces_get(self):
        """Test case for workspaces_get

        Lists all workspaces
        """
        response = self.client.open(
            '/api/workspaces',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_post(self):
        """Test case for workspaces_post

        Create new workspace, accepts workspace name
        """
        workspace = Workspace()
        response = self.client.open(
            '/api/workspaces',
            method='POST',
            data=json.dumps(workspace),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_delete(self):
        """Test case for workspaces_workspace_id_delete

        Delete specified workspace by its UUID
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}'.format(workspaceId='workspaceId_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_get(self):
        """Test case for workspaces_workspace_id_get

        Get specified workspace by its UUID
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}'.format(workspaceId='workspaceId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_put(self):
        """Test case for workspaces_workspace_id_put

        Update specified workspace by its UUID
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}'.format(workspaceId='workspaceId_example'),
            method='PUT',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_get(self):
        """Test case for workspaces_workspace_id_topics_get

        Get all topics of the workspace specified by UUID
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics'.format(workspaceId='workspaceId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_post(self):
        """Test case for workspaces_workspace_id_topics_post

        Create new topic, returns the topic
        """
        topic = Topic()
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics'.format(workspaceId='workspaceId_example'),
            method='POST',
            data=json.dumps(topic),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_delete(self):
        """Test case for workspaces_workspace_id_topics_topic_id_delete

        Delete specified topic
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
