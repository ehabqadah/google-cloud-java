# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Instructions:
#
# Check out the googleapis repo somewhere locally (e.g. from
# https://github.com/googleapis/googleapis):
#
# $ git checkout https://github.com/googleapis/googleapis.git
#
# Run this script:
#
# $ python utilities/batch_generate_apis.py PATH_TO_GOOGLEAPIS

import argparse
import os

import generate_api


def run(googleapis):
    def generate(artman_yaml):
        generate_api.run_generate_api(os.path.join(googleapis, artman_yaml))

    # TODO Needs to have java_proto called instead of java_grpc
    #generate('google/datastore/artman_datastore.yaml')

    generate('google/cloud/bigquery/datatransfer/artman_bigquerydatatransfer.yaml')
    generate('google/bigtable/artman_bigtable.yaml')
    generate('google/bigtable/admin/artman_bigtableadmin.yaml')
    generate('google/container/artman_container.yaml')
    generate('google/cloud/dataproc/artman_dataproc_v1.yaml')
    generate('google/cloud/dialogflow/artman_dialogflow_v2.yaml')
    generate('google/cloud/dialogflow/artman_dialogflow_v2beta1_java.yaml')
    generate('google/privacy/dlp/artman_dlp_v2.yaml')
    generate('google/devtools/clouderrorreporting/artman_errorreporting.yaml')
    generate('google/firestore/artman_firestore.yaml')
    generate('google/cloud/language/artman_language_v1.yaml')
    generate('google/cloud/language/artman_language_v1beta2.yaml')
    generate('google/logging/artman_logging.yaml')
    generate('google/monitoring/artman_monitoring.yaml')
    generate('google/pubsub/artman_pubsub.yaml')
    generate('google/cloud/oslogin/artman_oslogin_v1.yaml')
    generate('google/cloud/redis/artman_redis_v1beta1.yaml')
    generate('google/spanner/artman_spanner.yaml')
    generate('google/spanner/admin/database/artman_spanner_admin_database.yaml')
    generate('google/spanner/admin/instance/artman_spanner_admin_instance.yaml')
    generate('google/cloud/speech/artman_speech_v1.yaml')
    generate('google/cloud/speech/artman_speech_v1beta1.yaml')
    generate('google/cloud/speech/artman_speech_v1p1beta1.yaml')
    generate('google/cloud/texttospeech/artman_texttospeech_v1.yaml')
    generate('google/cloud/texttospeech/artman_texttospeech_v1beta1.yaml')
    generate('google/devtools/cloudtrace/artman_cloudtrace_v1.yaml')
    generate('google/devtools/cloudtrace/artman_cloudtrace_v2.yaml')
    generate('google/cloud/videointelligence/artman_videointelligence_v1beta1.yaml')
    generate('google/cloud/videointelligence/artman_videointelligence_v1beta2.yaml')
    generate('google/cloud/videointelligence/artman_videointelligence_v1p1beta1.yaml')
    generate('google/cloud/videointelligence/artman_videointelligence_v1.yaml')
    generate('google/cloud/vision/artman_vision_v1.yaml')
    generate('google/cloud/vision/artman_vision_v1p1beta1.yaml')
    generate('google/cloud/vision/artman_vision_v1p2beta1.yaml')
    generate('google/cloud/websecurityscanner/artman_websecurityscanner_v1alpha.yaml')


def main():
    # TODO Make the docker image the default, add --local option
    parser = argparse.ArgumentParser(description='Batch generate all APIs.')
    parser.add_argument('googleapis', help='The path to the googleapis repo')
    args = parser.parse_args()

    run(args.googleapis)

if __name__ == '__main__':
    main()
