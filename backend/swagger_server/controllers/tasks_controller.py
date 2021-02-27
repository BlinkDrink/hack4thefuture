import connexion
import six

from swagger_server.models.material import Material  # noqa: E501
from swagger_server.models.task import Task  # noqa: E501
from swagger_server import util


def workspaces_workspace_id_topics_topic_id_tasks_get(workspaceId, topicId):  # noqa: E501
    """Get all tasks for a topic

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str

    :rtype: List[Task]
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_topic_id_tasks_post(workspaceId, topicId):  # noqa: E501
    """Create new task for the specified topic

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str

    :rtype: Task
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_topic_id_tasks_task_id_get(workspaceId, topicId, taskId):  # noqa: E501
    """Return specified task

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str
    :param taskId: ID of task
    :type taskId: str

    :rtype: Task
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_topic_id_tasks_task_id_put(workspaceId, topicId, taskId):  # noqa: E501
    """Update task specified by id, return task

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str
    :param taskId: ID of task
    :type taskId: str

    :rtype: Material
    """
    return 'do some magic!'


def workspaces_workspace_id_topics_topic_id_tasks_task_id_submit_post(workspaceId, topicId, taskId):  # noqa: E501
    """Submit the completed task

     # noqa: E501

    :param workspaceId: ID of workspace
    :type workspaceId: str
    :param topicId: ID of topic
    :type topicId: str
    :param taskId: ID of task
    :type taskId: str

    :rtype: List[bool]
    """
    return 'do some magic!'
