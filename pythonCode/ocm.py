from PIL import Image, ImageDraw, ImageFilter, ImageEnhance
import matplotlib.pyplot as plt
import math


mapName = 'map1'

# ---------------------------------------------------------------------------------------------------------------------------------------------------------------

filepath = './maps/'+mapName+'.map'
lines = []

with open(filepath) as fp:

   recordinglines = False
   line = fp.readline()
   cnt = 1

   while line:

       print("Reading Line {}: {}".format(cnt, line.strip()))
       line = fp.readline()
       cnt += 1

       if recordinglines:
           if line.strip() != "DATA":
                lines.append(line.strip())

       if line.strip() == "LINES":
           recordinglines = True

lines.remove('')
print("Number of Lines: {}".format(len(lines)))


formattedLines = []

for line in lines:
    linedata = line.split()
    formattedLines.append({'p1': [int(linedata[0]), int(linedata[1])], 'p2':[int(linedata[2]), int(linedata[3])]})




# ---------------------------------------------------------------------------------------------------------------------------------------------------------------

grid = []
gridcellsize = 100
originPoint = []
numberOfCellsBuffer = 0

minX = 0
minY = 0
maxX = 0
maxY = 0

for line in formattedLines:
    p1x = line['p1'][0]
    p1y = line['p1'][1]
    p2x = line['p2'][0]
    p2y = line['p2'][1]

    if p1x < minX:
        minX = p1x
    if p1y < minY:
        minY = p1y

    if p2x < minX:
        minX = p2x
    if p2y < minY:
        minY = p2y

    if p1x > maxX:
        maxX = p1x
    if p1y > maxY:
        maxY = p1y

    if p2x > maxX:
        maxX = p2x
    if p2y > maxY:
        maxY = p2y

print("minX {} minY {} maxX {} maxY {}".format(minX, minY, maxX, maxY))

print(originPoint)

lengthX = maxX - minX
lengthY = maxY - minY

print(lengthX)
print(lengthY)



# ---------------------------------------------------------------------------------------------------------------------------------------------------------------
img_small = Image.new('RGB', (int(lengthX / gridcellsize) + 1, int(lengthY / gridcellsize)+1), (255, 255, 255))
xadj = abs(minX)
yadj = abs(minY)

for line in formattedLines:
    draw = ImageDraw.Draw(img_small)
    draw.line((int((line['p1'][0] + xadj)/gridcellsize), int((line['p1'][1] + yadj)/gridcellsize), int((line['p2'][0] + xadj)/gridcellsize), int((line['p2'][1] + yadj))/gridcellsize), fill=0)
    del draw


#img_filtered = img_small.filter(ImageFilter.BoxBlur(3))
img_filtered = img_small.filter(ImageFilter.GaussianBlur(3))

enhancer = ImageEnhance.Contrast(img_filtered)
img_filtered = enhancer.enhance(2.0)



#img_filtered = img_small.filter(ImageFilter.SMOOTH)
img_combined = Image.new('RGB', (int(lengthX / gridcellsize) + 1, int(lengthY / gridcellsize)+1), (255, 255, 255))


pixel_small = img_small.load()
pixel_filtered = img_filtered.load()
pixel_combined = img_combined.load()

width, height = img_small.size
for y in range(height):
    for x in range(width):
        if pixel_small[x, y] == (0, 0, 0):
            pixel_combined[x, y] = (0,0,0)
        if pixel_small[x, y] == (255, 255, 255):
            pixel_combined[x, y] = pixel_filtered[x, y]



#img_small.show()
#img_filtered.show()
img_combined.show()


rotated_img =  img_combined.transpose(Image.FLIP_TOP_BOTTOM)

rotated_img.show()
rotated_img.save(mapName+".png")