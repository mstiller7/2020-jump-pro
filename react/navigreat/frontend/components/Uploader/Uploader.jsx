import React from "react";
import { useOvermind } from "../../overmind/config";
import { Button } from "react-native";
import { Input } from "react-native-elements";
import { Container, Content, Form, Item } from "native-base";

export default function Create() {
  const { state, actions } = useOvermind();

  const payload = {
    name: "",
  };

  return (
    <Container>
      <Content>
        <Form>
          <Item>
            <Input
              placeholder="Name"
              onChangeText={(text) => (payload.name = text)}
            />
          </Item>
          <Button title="Select Photo" onPress={() => actions.pickPhoto()} />
          <Button
            title="Submit"
            // TODO capture the user's input and put it as the title below
            onPress={() => actions.uploadPhoto(payload.name, state.photo)}
          />
        </Form>
      </Content>
    </Container>
  );
}