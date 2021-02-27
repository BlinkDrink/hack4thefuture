import connexion
import six

from swagger_server.models.topic import Topic  # noqa: E501
from swagger_server import util


def workspaces_workspace_id_topics_topic_id_get(workspaceId, topicId):  # noqa: E501
    """Return specified topic

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str

    :rtype: Topic
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_topic_id_put(workspaceId, topicId):  # noqa: E501
    """Update topic specified by id, return topic

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str

    :rtype: Topic
    """
    return 'do some magic!'
