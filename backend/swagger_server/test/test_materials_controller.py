# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.material import Material  # noqa: E501
from swagger_server.test import BaseTestCase


class TestMaterialsController(BaseTestCase):
    """MaterialsController integration test stubs"""

    def test_workspaces_workspace_id_topics_topic_id_materials_get(self):
        """Test case for workspaces_workspace_id_topics_topic_id_materials_get

        Get all materials for a topic
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/materials'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_materials_material_id_delete(self):
        """Test case for workspaces_workspace_id_topics_topic_id_materials_material_id_delete

        Delete specified topic
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/materials/{materialId}'.format(workspaceId='workspaceId_example', topicId='topicId_example', materialId='materialId_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_materials_material_id_get(self):
        """Test case for workspaces_workspace_id_topics_topic_id_materials_material_id_get

        Return specified material
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/materials/{materialId}'.format(workspaceId='workspaceId_example', topicId='topicId_example', materialId='materialId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_materials_material_id_put(self):
        """Test case for workspaces_workspace_id_topics_topic_id_materials_material_id_put

        Update material specified by id, return material
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/materials/{materialId}'.format(workspaceId='workspaceId_example', topicId='topicId_example', materialId='materialId_example'),
            method='PUT',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_materials_post(self):
        """Test case for workspaces_workspace_id_topics_topic_id_materials_post

        Create new material for the specified topic
        """
        material = Material()
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/materials'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='POST',
            data=json.dumps(material),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_tasks_task_id_delete(self):
        """Test case for workspaces_workspace_id_topics_topic_id_tasks_task_id_delete

        Delete specified task
        """
        response = self.client.open(
            '/api/workspaces/{workspaceId}/topics/{topicId}/tasks/{taskId}'.format(workspaceId='workspaceId_example', topicId='topicId_example', taskId='taskId_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
