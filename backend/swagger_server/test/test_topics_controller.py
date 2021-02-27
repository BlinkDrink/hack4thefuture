# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.topic import Topic  # noqa: E501
from swagger_server.test import BaseTestCase


class TestTopicsController(BaseTestCase):
    """TopicsController integration test stubs"""

    def test_workspaces_workspace_id_topics_topic_id_get(self):
        """Test case for workspaces_workspace_id_topics_topic_id_get

        Return specified topic
        """
        response = self.client.open(
            '/api//workspaces/{workspaceId}/topics/{topicId}'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_workspaces_workspace_id_topics_topic_id_put(self):
        """Test case for workspaces_workspace_id_topics_topic_id_put

        Update topic specified by id, return topic
        """
        response = self.client.open(
            '/api//workspaces/{workspaceId}/topics/{topicId}'.format(workspaceId='workspaceId_example', topicId='topicId_example'),
            method='PUT',
            content_type='text')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
