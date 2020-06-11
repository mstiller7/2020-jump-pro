import React from "react";
import { View, Button } from "react-native";

export default function Landing({ navigation }) {
  return (
    <View style={{ padding: "10px" }}>
      <Button title="View Maps" onPress={() => navigation.navigate("Map")} />
      <Button title="View Rooms" onPress={() => navigation.navigate("Rooms")} />
      <Button
        title="Create Room"
        onPress={() => navigation.navigate("Create")}
      />
      <Button
        title="Upload Images"
        onPress={() => navigation.navigate("Uploader")}
      />
    </View>
  );
}