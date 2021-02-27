import connexion
import six

from swagger_server.models.topic import Topic  # noqa: E501
from swagger_server.models.workspace import Workspace  # noqa: E501
from swagger_server import util


def workspaces_get():  # noqa: E501
    """Lists all workspaces

     # noqa: E501


    :rtype: List[Workspace]
    """
    return 'do some magic!'


def workspaces_post(workspace=None):  # noqa: E501
    """Create new workspace, accepts workspace name

     # noqa: E501

    :param workspace: 
    :type workspace: dict | bytes

    :rtype: Workspace
    """
    if connexion.request.is_json:
        workspace = Workspace.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def workspaces_workspace_id_delete(workspaceId):  # noqa: E501
    """Delete specified workspace by its UUID

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str

    :rtype: None
    """
    return 'do some magic!'


def workspaces_workspace_id_get(workspaceId):  # noqa: E501
    """Get specified workspace by its UUID

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str

    :rtype: Workspace
    """
    return 'do some magic!'


def workspaces_workspace_id_put(workspaceId):  # noqa: E501
    """Update specified workspace by its UUID

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str

    :rtype: Workspace
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_get(workspaceId):  # noqa: E501
    """Get all topics of the workspace specified by UUID

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str

    :rtype: List[Topic]
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_post(workspaceId, topic=None):  # noqa: E501
    """Create new topic, returns the topic

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topic: 
    :type topic: dict | bytes

    :rtype: Topic
    """
    if connexion.request.is_json:
        topic = Topic.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def workspaces_workspace_id_topics_topic_id_delete(workspaceId, topicId):  # noqa: E501
    """Delete specified topic

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str

    :rtype: None
    """
    return 'do some magic!'
