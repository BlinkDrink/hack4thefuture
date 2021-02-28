# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class Topic(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, uuid: str=None, name: str=None):  # noqa: E501
        """Topic - a model defined in Swagger

        :param uuid: The uuid of this Topic.  # noqa: E501
        :type uuid: str
        :param name: The name of this Topic.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'uuid': str,
            'name': str
        }

        self.attribute_map = {
            'uuid': 'uuid',
            'name': 'name'
        }

        self._uuid = uuid
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'Topic':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Topic of this Topic.  # noqa: E501
        :rtype: Topic
        """
        return util.deserialize_model(dikt, cls)

    @property
    def uuid(self) -> str:
        """Gets the uuid of this Topic.


        :return: The uuid of this Topic.
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid: str):
        """Sets the uuid of this Topic.


        :param uuid: The uuid of this Topic.
        :type uuid: str
        """

        self._uuid = uuid

    @property
    def name(self) -> str:
        """Gets the name of this Topic.


        :return: The name of this Topic.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Topic.


        :param name: The name of this Topic.
        :type name: str
        """

        self._name = name